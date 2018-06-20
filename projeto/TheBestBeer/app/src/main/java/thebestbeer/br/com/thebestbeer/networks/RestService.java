package thebestbeer.br.com.thebestbeer.networks;

import retrofit2.Call;
import retrofit2.http.GET;
import thebestbeer.br.com.thebestbeer.models.Cervejas;
import thebestbeer.br.com.thebestbeer.models.Usuario;

public interface RestService {

    @GET("/thebestbeer/crud/cervejas.php")
    Call<WebserviceResponse<Cervejas[]>> getCervejas();

}
