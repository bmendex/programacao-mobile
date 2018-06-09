package thebestbeer.br.com.thebestbeer.activities;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.renderscript.ScriptGroup;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

import thebestbeer.br.com.thebestbeer.R;
import thebestbeer.br.com.thebestbeer.databinding.ActivityLoginBinding;
import thebestbeer.br.com.thebestbeer.util.Log;

@EActivity(R.layout.activity_login)
public class LoginActivity extends AppCompatActivity {

    final CallbackManager callbackManager = CallbackManager.Factory.create();

  //  ---------------------------------------------------------------------
  //   ATRIBUTOS
  //  ---------------------------------------------------------------------

    private ActivityLoginBinding mBinding;

  //  ---------------------------------------------------------------------
  //   METODOS
  //  ---------------------------------------------------------------------
    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("LoginActivity.onCreate");
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);

    }

    @AfterViews
    protected void initi() {

        Log.d("LoginActivity.initi");

        // Inicializa o databinding
        mBinding = ActivityLoginBinding.inflate(getLayoutInflater());

       // mBinding.loginButton.setReadPermissions("email");


        // Callback registration
        mBinding.loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                // App code
                Log.d("LoginActivity.onSuccess");
                Toast.makeText(LoginActivity.this, "onSuccess", Toast.LENGTH_SHORT).show();
                //HomeActivity_.intent(LoginActivity.this).start();
            }

            @Override
            public void onCancel() {
                // App code
                Log.d("LoginActivity.onCancel");
                Toast.makeText(LoginActivity.this, "onCancel", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onError(FacebookException exception) {
                // App code
                Log.d("LoginActivity.onError");
                Toast.makeText(LoginActivity.this, "onErro", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
