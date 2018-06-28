package thebestbeer.br.com.thebestbeer.fragmentos;

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
import thebestbeer.br.com.thebestbeer.R;
import thebestbeer.br.com.thebestbeer.models.Cardapio;
import thebestbeer.br.com.thebestbeer.models.Cervejas;
import thebestbeer.br.com.thebestbeer.networks.NetworkManager;
import thebestbeer.br.com.thebestbeer.networks.WebserviceResponse;
import thebestbeer.br.com.thebestbeer.util.Log;
import thebestbeer.br.com.thebestbeer.views.adapter.CardapioRecyclerViewAdapter;
import thebestbeer.br.com.thebestbeer.views.adapter.FeedRecyclerViewAdapter;

@EFragment(R.layout.fragment_cardapio)
public class CardapioFragment extends Fragment{

    /**
     * @FragmentArg é usado para indicar que a variavel será inicializada com
     * os dados vindos do build()
     */

    @ViewById(R.id.cardapio_recyclerview)
    RecyclerView mRecyclerView;

    @AfterViews
    protected void initi(){

        Log.d("FeedFragment.initi: ");

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setHasFixedSize(true);

        NetworkManager.service().getCardapio().enqueue(new Callback<WebserviceResponse<Cardapio[]>>() {
            @Override
            public void onResponse(Call<WebserviceResponse<Cardapio[]>> call, Response<WebserviceResponse<Cardapio[]>> response) {
                Log.d("FeedFragment.onResponse" + response.raw());
                Log.d("FeedFragment.onResponse" + response.message());

                trataRespostaOk(response.body());
          }

            @Override
            public void onFailure(Call<WebserviceResponse<Cardapio[]>> call, Throwable t) {
                trataRespostaErro(t);
            }
        });
    }

    private void trataRespostaErro(Throwable t) {
        // Para tratar o erro e exibir a mensagem de erro da chamada do webservice

        Log.e("FeedFragment.trataRespostaErro" + t);
        Toast.makeText(getContext(), t.getMessage(), Toast.LENGTH_LONG).show();
    }

    private void trataRespostaOk(WebserviceResponse<Cardapio[]> body) {

        // Recupera a lista retornadas pelo webservice
        final Cardapio[] result = body.getObject();

        List<Cardapio> cardapios = new ArrayList<>();
        for(Cardapio cardapio : result){
            cardapios.add(cardapio);
        }

        Log.d(">> " + cardapios.size());
        Log.d(">> " + cardapios);

        // Amarramos o recycler view com o adapter para saber em qual momento cada item será desenhado
        CardapioRecyclerViewAdapter adapter = new CardapioRecyclerViewAdapter(cardapios);

        // Percorre a lista e preenche todo o recyclerview
        mRecyclerView.setAdapter(adapter);
        mRecyclerView.getAdapter().notifyDataSetChanged();
    }


}
