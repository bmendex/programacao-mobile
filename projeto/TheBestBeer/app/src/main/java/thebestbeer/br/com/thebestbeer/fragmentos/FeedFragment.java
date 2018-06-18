package thebestbeer.br.com.thebestbeer.fragmentos;

import android.support.v4.app.Fragment;
import android.widget.Toast;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.FragmentArg;
import org.androidannotations.annotations.ViewById;

import thebestbeer.br.com.thebestbeer.R;
import thebestbeer.br.com.thebestbeer.util.Log;

@EFragment(R.layout.fragment_feed)
public class FeedFragment extends Fragment{

    /**
     * @FragmentArg é usado para indicar que a variavel será inicializada com
     * os dados vindos do build()
     */
    @FragmentArg
    private String mTitulo;

    @ViewById(R.id.feed_recyclerview)


    @AfterViews
    protected void initi(){

        Log.d("FeedFragment.initi: " + mTitulo);
        Toast.makeText(getContext(), "Foi", Toast.LENGTH_SHORT).show();

    }



}
