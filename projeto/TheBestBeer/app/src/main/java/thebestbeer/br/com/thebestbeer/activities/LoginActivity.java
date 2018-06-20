package thebestbeer.br.com.thebestbeer.activities;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Handler;
import android.renderscript.ScriptGroup;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

import thebestbeer.br.com.thebestbeer.R;
import thebestbeer.br.com.thebestbeer.databinding.ActivityLoginBinding;
import thebestbeer.br.com.thebestbeer.util.Log;
import thebestbeer.br.com.thebestbeer.util.SharedPrefUtil;

@EActivity(R.layout.activity_login)
public class LoginActivity extends AppCompatActivity {

    //---------------------------------------------------------------------
    // ATRIBUTOS
    //---------------------------------------------------------------------

    private ActivityLoginBinding mBinding;
    private CallbackManager callbackManager;

    //---------------------------------------------------------------------
    // METODOS
    //---------------------------------------------------------------------
    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);
    }

    /**
     * Este método é chamado assim que as views forem inicializados no
     * onCreate()
     */
    @AfterViews
    protected void initi(){

        // Inicializa o data binding
        mBinding = ActivityLoginBinding.inflate(getLayoutInflater());

        // retorno de resposta do facebook
        callbackManager = CallbackManager.Factory.create();

        LoginManager.getInstance().registerCallback(callbackManager,
                new FacebookCallback<LoginResult>() {
                    @Override
                    public void onSuccess(LoginResult loginResult) {
                        // App code
                        SharedPrefUtil.setEfetuouLogin(LoginActivity.this, true);
                        HomeActivity_.intent(LoginActivity.this).start();
                        finish();
                    }

                    @Override
                    public void onCancel() {
                        // App code
                        Toast.makeText(LoginActivity.this, "CANCELOU", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onError(FacebookException exception) {
                        // App code
                        Toast.makeText(LoginActivity.this, "ERRO", Toast.LENGTH_SHORT).show();
                        Log.d("LoginActivity.onError");
                    }
                });




//        mBinding.loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
//                    @Override
//                    public void onSuccess(final LoginResult loginResult) {
//                        // Se sucesso acessar home
//                        Toast.makeText(LoginActivity.this, "Deu boa", Toast.LENGTH_SHORT).show();
//
//                        Log.d("LoginActivity.onSuccess: "+ loginResult.getAccessToken());
//
//                        AccessToken accessToken = AccessToken.getCurrentAccessToken();
//                        boolean isLoggedIn = accessToken != null && !accessToken.isExpired();
//                    }
//
//                    @Override
//                    public void onCancel() {
//                        // Se cancelar voltar para tela de login
//                        Toast.makeText(LoginActivity.this, "Não deu boa", Toast.LENGTH_SHORT).show();
//
//                        Log.d("LoginActivity.onCancel");
//                    }
//
//                    @Override
//                    public void onError(FacebookException exception) {
//                        // Se erro setar mensagem
//                        Toast.makeText(LoginActivity.this, "ERRO", Toast.LENGTH_SHORT).show();
//                        Log.d("LoginActivity.onError");
//                    }
//                }
//        );
//        mBinding.entrarSemLgnFb.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                HomeActivity_.intent(LoginActivity.this).start();
//                Log.d("LoginActivity.onClick" + HomeActivity_.intent(LoginActivity.this));
//            }
//        });

        // Exibe a tela de login por 3 segundos e apresenta a tela inicial
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                    Toast.makeText(LoginActivity.this, "FOI", Toast.LENGTH_SHORT).show();

                //HomeActivity_.intent(LoginActivity.this).start();

            }
        },1000);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        callbackManager.onActivityResult(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);
        Log.d("LoginActivity.initi");
    }
}
