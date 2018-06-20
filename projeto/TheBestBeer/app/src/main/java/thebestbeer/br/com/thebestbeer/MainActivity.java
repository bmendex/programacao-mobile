package thebestbeer.br.com.thebestbeer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import thebestbeer.br.com.thebestbeer.activities.HomeActivity_;
import thebestbeer.br.com.thebestbeer.activities.LoginActivity_;
import thebestbeer.br.com.thebestbeer.util.Log;
import thebestbeer.br.com.thebestbeer.util.SharedPrefUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MainActivity.onCreate");

        boolean estaLogado = SharedPrefUtil.getEfetuouLogin(this);
        Log.d("MainActivity.onCreate" + estaLogado);

        LoginActivity_.intent(this).start();
        finish();

//        if (estaLogado) {
//            HomeActivity_.intent(this).start();
//            finish();
//        }
//        else {
//            LoginActivity_.intent(this).start();
//            finish();
//        }
    }
}
