package thebestbeer.br.com.thebestbeer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import thebestbeer.br.com.thebestbeer.activities.HomeActivity_;
import thebestbeer.br.com.thebestbeer.activities.LoginActivity_;
import thebestbeer.br.com.thebestbeer.activities.PreHomeActivity_;
import thebestbeer.br.com.thebestbeer.util.Log;
import thebestbeer.br.com.thebestbeer.util.SharedPrefUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MainActivity.onCreate");

        // Inclui icone no app
        getSupportActionBar().setDisplayShowHomeEnabled(false);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        boolean estaLogado = SharedPrefUtil.getEfetuouLogin(this);
        Log.d("MainActivity.onCreate" + estaLogado);

        LoginActivity_.intent(this).start();
        finish();

        if (estaLogado) {
            PreHomeActivity_.intent(this).start();
            finish();
        }
        else {
            LoginActivity_.intent(this).start();
            finish();
        }
    }
}
