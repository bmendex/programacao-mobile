package thebestbeer.br.com.the_best_beer.activities;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import thebestbeer.br.com.the_best_beer.R;
import thebestbeer.br.com.the_best_beer.databinding.ActivityHistoriaBinding;

@EActivity(R.layout.activity_historia)
public class HistoriaActivity extends AppCompatActivity {
    private ActivityHistoriaBinding mBinding;


    @AfterViews
    protected void initi(){
        mBinding = ActivityHistoriaBinding.inflate(getLayoutInflater());
    }
}
