package thebestbeer.br.com.the_best_beer.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

import thebestbeer.br.com.the_best_beer.R;
import thebestbeer.br.com.the_best_beer.databinding.ActivityLoginBinding;
import thebestbeer.br.com.the_best_beer.util.Log;
import thebestbeer.br.com.the_best_beer.util.SharedPrefUtil;

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


        // Exibe a tela de login por 3 segundos e apresenta a tela inicial
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                    Toast.makeText(LoginActivity.this, "Bem-vindo", Toast.LENGTH_SHORT).show();

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
