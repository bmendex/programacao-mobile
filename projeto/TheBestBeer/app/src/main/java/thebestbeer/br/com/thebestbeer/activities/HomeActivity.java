package thebestbeer.br.com.thebestbeer.activities;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.List;

import thebestbeer.br.com.thebestbeer.R;
import thebestbeer.br.com.thebestbeer.fragmentos.AvaliacaoFragment;
import thebestbeer.br.com.thebestbeer.fragmentos.AvaliacaoFragment_;
import thebestbeer.br.com.thebestbeer.fragmentos.CardapioFragment;
import thebestbeer.br.com.thebestbeer.fragmentos.CardapioFragment_;
import thebestbeer.br.com.thebestbeer.fragmentos.FeedFragment;
import thebestbeer.br.com.thebestbeer.fragmentos.FeedFragment_;
import thebestbeer.br.com.thebestbeer.models.Avaliacao;
import thebestbeer.br.com.thebestbeer.util.Log;
import thebestbeer.br.com.thebestbeer.views.adapter.HomeViewPagerAdapter;

@EActivity(R.layout.activity_home)
public class HomeActivity extends AppCompatActivity{

    @ViewById(R.id.home_toolbar)
    protected Toolbar mToolbar;

    @ViewById(R.id.tabs)
    protected TabLayout mTabLayout;

    @ViewById(R.id.container)
    protected ViewPager mContainer;

    @ViewById(R.id.botao_info)
    protected Button mBotaoInfo;

    @ViewById(R.id.fab)
    FloatingActionButton mButtonBack;

    private FeedFragment mFeedFragment;
    private CardapioFragment mCardapioFragment;
    private AvaliacaoFragment mAvaliacaoFragment;

    /**
     * Depois da criação da activity (onCreate), o metodo com anotação
     * @AfterViews é chamado
     */
    @AfterViews
    protected void initi(){
        Log.d("HomeActivity.initi");
        // Realiza o setup da toolbar
        if(mToolbar != null){
            setSupportActionBar(mToolbar);
        }

        // Inclui icone no app
        getSupportActionBar().setDisplayShowHomeEnabled(false);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        // Instanciando o FeedFragment com annotation
        mFeedFragment = FeedFragment_.builder().build();
        mCardapioFragment = CardapioFragment_.builder().build();
        mAvaliacaoFragment = AvaliacaoFragment_.builder().build();

        // Seta os tabs
        mTabLayout.setupWithViewPager(mContainer);


        //Instanciando lista do fragmento
        List<Fragment> lista = new ArrayList<>();
        lista.add(mCardapioFragment);
        lista.add(mFeedFragment);
        lista.add(mAvaliacaoFragment);

        //define a classe adapter do viewpager
        HomeViewPagerAdapter adapter = new HomeViewPagerAdapter(
                getSupportFragmentManager(), lista);
        mContainer.setAdapter(adapter);

        mButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PreHomeActivity_.intent(getApplicationContext()).start();
            }
        });

    }

}
