package thebestbeer.br.com.thebestbeer.activities;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.renderscript.ScriptGroup;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

import org.androidannotations.annotations.EActivity;

import thebestbeer.br.com.thebestbeer.R;
import thebestbeer.br.com.thebestbeer.databinding.ActivityLoginBinding;

@EActivity(R.layout.activity_login)
public abstract class LoginActivity extends AppCompatActivity {

    //---------------------------------------------------------------------
    // ATRIBUTOS
    //---------------------------------------------------------------------

    private ActivityLoginBinding mBinding;

    //---------------------------------------------------------------------
    // METODOS
    //---------------------------------------------------------------------
    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);

        this.loginFacebook = findViewById(R.id.login_button);

    }
    LoginButton loginFacebook;
    final CallbackManager callbackManager = CallbackManager.Factory.create();

    //      Callback registration
        loginFacebook.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
        @Override
        public void onSuccess(LoginResult loginResult) {
            // Se sucesso acessar home
            Toast.makeText(LoginActivity.this, "Deu boa", Toast.LENGTH_SHORT).show();
//                    HomeActivity_.intent(LoginActivity.this).start();
//                    finish();
        }

        @Override
        public void onCancel() {
            // Se cancelar voltar para tela de login
            finish();
        }

        @Override
        public void onError(FacebookException exception) {
            // Se erro setar mensagem

        }
    }
        );

}
