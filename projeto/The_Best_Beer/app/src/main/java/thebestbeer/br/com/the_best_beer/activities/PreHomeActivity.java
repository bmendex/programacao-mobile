package thebestbeer.br.com.the_best_beer.activities;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import thebestbeer.br.com.the_best_beer.R;
import thebestbeer.br.com.the_best_beer.databinding.ActivityPreHomeBinding;

@EActivity(R.layout.activity_pre_home)
public class PreHomeActivity extends AppCompatActivity {

    private ActivityPreHomeBinding mBinding;

    @ViewById(R.id.btn_enter_cerveja)
    Button mButtonEnter;

    @ViewById(R.id.btn_enter_historia)
    Button getmButtonHistoria;

    @AfterViews
    protected void initi(){
        mBinding = ActivityPreHomeBinding.inflate(getLayoutInflater());

        // Inclui icone no app
        getSupportActionBar().setDisplayShowHomeEnabled(false);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        mButtonEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeActivity_.intent(getApplicationContext()).start();
            }
        });

        getmButtonHistoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HistoriaActivity_.intent(getApplicationContext()).start();
            }
        });

    }

}
