package thebestbeer.br.com.the_best_beer.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class HomeViewPagerAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> mFragmentos;

    public HomeViewPagerAdapter(final FragmentManager fm, List<Fragment> fragmentos) {
        super(fm);
        mFragmentos = fragmentos;
    }

    @Override
    public Fragment getItem(final int position) {
        return mFragmentos.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentos.size();
    }


    // define o titulo de cada aba
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0){
            return "Cardápio";
        }else if(position == 1){
            return "Cerveja";
        }else if(position == 2){
            return "Avaliações";
        }
        return "";

    }
}
