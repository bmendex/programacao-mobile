package thebestbeer.br.com.thebestbeer.activities;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import thebestbeer.br.com.thebestbeer.R;
import thebestbeer.br.com.thebestbeer.databinding.ActivityPreHomeBinding;

@EActivity(R.layout.activity_pre_home)
public class PreHomeActivity extends AppCompatActivity {

    private ActivityPreHomeBinding mBinding;

    @ViewById(R.id.btn_enter_cerveja)
    Button mButtonEnter;

    @AfterViews
    protected void initi(){
        mBinding = ActivityPreHomeBinding.inflate(getLayoutInflater());

        mButtonEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeActivity_.intent(getApplicationContext()).start();
            }
        });

    }

}
