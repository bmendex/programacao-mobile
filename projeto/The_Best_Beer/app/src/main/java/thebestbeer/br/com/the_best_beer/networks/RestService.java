package thebestbeer.br.com.the_best_beer.networks;

import retrofit2.Call;
import retrofit2.http.GET;
import thebestbeer.br.com.the_best_beer.models.Avaliacao;
import thebestbeer.br.com.the_best_beer.models.Cardapio;
import thebestbeer.br.com.the_best_beer.models.Cervejas;

public interface RestService {
    @GET("/thebestbeer/jsonCerveja.php")
    Call<WebserviceResponse<Cervejas[]>> getCervejas();

    @GET("/thebestbeer/jsonAvaliacao.php")
    Call<WebserviceResponse<Avaliacao[]>> getAvalicao();

    @GET("/thebestbeer/jsonCardapio.php")
    Call<WebserviceResponse<Cardapio[]>> getCardapio();
}
