package thebestbeer.br.com.thebestbeer.networks;

import retrofit2.Call;
import retrofit2.http.GET;
import thebestbeer.br.com.thebestbeer.models.Avaliacao;
import thebestbeer.br.com.thebestbeer.models.Cardapio;
import thebestbeer.br.com.thebestbeer.models.Cervejas;
import thebestbeer.br.com.thebestbeer.models.Usuario;

public interface RestService {

    @GET("/thebestbeer/jsonCerveja.php")
    Call<WebserviceResponse<Cervejas[]>> getCervejas();

    @GET("/thebestbeer/jsonAvalicao.php")
    Call<WebserviceResponse<Avaliacao[]>> getAvalicao();

    @GET("/thebestbeer/jsonCardapio.php")
    Call<WebserviceResponse<Cardapio[]>> getCardapio();

}
