package thebestbeer.br.com.thebestbeer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import thebestbeer.br.com.thebestbeer.activities.LoginActivity_;
import thebestbeer.br.com.thebestbeer.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MainActivity.onCreate");

        LoginActivity_.intent(this).start();
        finish();
    }
}
