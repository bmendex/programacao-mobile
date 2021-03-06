package thebestbeer.br.com.the_best_beer.fragmentos;

import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.FragmentArg;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import thebestbeer.br.com.the_best_beer.R;
import thebestbeer.br.com.the_best_beer.models.Cervejas;
import thebestbeer.br.com.the_best_beer.networks.NetworkManager;
import thebestbeer.br.com.the_best_beer.networks.WebserviceResponse;
import thebestbeer.br.com.the_best_beer.util.Log;
import thebestbeer.br.com.the_best_beer.adapter.FeedRecyclerViewAdapter;

@EFragment(R.layout.fragment_feed)
public class FeedFragment extends Fragment{

    /**
     * @FragmentArg é usado para indicar que a variavel será inicializada com
     * os dados vindos do build()
     */
    @FragmentArg
    String mTitulo;

    @ViewById(R.id.feed_recyclerview)
    RecyclerView mRecyclerView;

    @AfterViews
    protected void initi(){

        Log.d("FeedFragment.initi: " + mTitulo);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setHasFixedSize(true);

        NetworkManager.service().getCervejas().enqueue(new Callback<WebserviceResponse<Cervejas[]>>() {
            @Override
            public void onResponse(Call<WebserviceResponse<Cervejas[]>> call, Response<WebserviceResponse<Cervejas[]>> response) {
                Log.d("FeedFragment.onResponse" + response.raw());
                Log.d("FeedFragment.onResponse" + response.message());

                trataRespostaOk(response.body());
          }

            @Override
            public void onFailure(Call<WebserviceResponse<Cervejas[]>> call, Throwable t) {
                trataRespostaErro(t);
            }
        });
    }

    private void trataRespostaErro(Throwable t) {
        // Para tratar o erro e exibir a mensagem de erro da chamada do webservice

        Log.e("FeedFragment.trataRespostaErro" + t);
        Toast.makeText(getContext(), t.getMessage(), Toast.LENGTH_LONG).show();
    }

    private void trataRespostaOk(WebserviceResponse<Cervejas[]> body) {

        // Recupera a lista retornadas pelo webservice
        final Cervejas[] result = body.getObject();

        List<Cervejas> cervejas = new ArrayList<>();
        for(Cervejas cerveja : result){
            cervejas.add(cerveja);
        }

        Log.d(">> " + cervejas.size());
        Log.d(">> " + cervejas);

        // Amarramos o recycler view com o adapter para saber em qual momento cada item será desenhado
        FeedRecyclerViewAdapter adapter = new FeedRecyclerViewAdapter(cervejas);

        // Percorre a lista e preenche todo o recyclerview
        mRecyclerView.setAdapter(adapter);
        mRecyclerView.getAdapter().notifyDataSetChanged();
    }


}
