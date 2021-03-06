package thebestbeer.br.com.the_best_beer.fragmentos;

import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import thebestbeer.br.com.the_best_beer.R;
import thebestbeer.br.com.the_best_beer.models.Avaliacao;
import thebestbeer.br.com.the_best_beer.networks.NetworkManager;
import thebestbeer.br.com.the_best_beer.networks.WebserviceResponse;
import thebestbeer.br.com.the_best_beer.util.Log;
import thebestbeer.br.com.the_best_beer.R;
import thebestbeer.br.com.the_best_beer.models.Avaliacao;
import thebestbeer.br.com.the_best_beer.networks.NetworkManager;
import thebestbeer.br.com.the_best_beer.networks.WebserviceResponse;
import thebestbeer.br.com.the_best_beer.util.Log;
import thebestbeer.br.com.the_best_beer.adapter.AvaliacaoRecyclerViewAdapter;

@EFragment(R.layout.fragment_avaliacao)
public class AvaliacaoFragment extends Fragment{

    @ViewById(R.id.avaliacao_recyclerview)
    RecyclerView mRecyclerView;


    @AfterViews
    protected void initi(){

        Log.d("FeedFragment.initi: ");

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setHasFixedSize(true);

        NetworkManager.service().getAvalicao().enqueue(new Callback<WebserviceResponse<Avaliacao[]>>() {
            @Override
            public void onResponse(Call<WebserviceResponse<Avaliacao[]>> call, Response<WebserviceResponse<Avaliacao[]>> response) {
                Log.d("FeedFragment.onResponse" + response.raw());
                Log.d("FeedFragment.onResponse" + response.message());

                trataRespostaOk(response.body());
            }

            @Override
            public void onFailure(Call<WebserviceResponse<Avaliacao[]>> call, Throwable t) {
                trataRespostaErro(t);
            }
        });
    }

    private void trataRespostaErro(Throwable t) {
        // Para tratar o erro e exibir a mensagem de erro da chamada do webservice

        Log.e("FeedFragment.trataRespostaErro" + t);
        Toast.makeText(getContext(), t.getMessage(), Toast.LENGTH_LONG).show();
    }

    private void trataRespostaOk(WebserviceResponse<Avaliacao[]> body) {

        // Recupera a lista retornadas pelo webservice
        final Avaliacao[] result = body.getObject();

        List<Avaliacao> avaliacoes = new ArrayList<>();
        for(Avaliacao avaliacao : result){
            avaliacoes.add(avaliacao);
        }

        Log.d(">> " + avaliacoes.size());
        Log.d(">> " + avaliacoes);

        // Amarramos o recycler view com o adapter para saber em qual momento cada item será desenhado
        AvaliacaoRecyclerViewAdapter adapter = new AvaliacaoRecyclerViewAdapter(avaliacoes);

        // Percorre a lista e preenche todo o recyclerview
        mRecyclerView.setAdapter(adapter);
        mRecyclerView.getAdapter().notifyDataSetChanged();
    }
}
