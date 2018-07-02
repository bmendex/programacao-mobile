package thebestbeer.br.com.the_best_beer.networks.data.remote;

import java.net.CacheRequest;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import thebestbeer.br.com.the_best_beer.networks.data.Post;

public interface APIService {
    @POST("/thebestbeer/jsonInsereCerveja.php")
    @FormUrlEncoded
    Call<Post> savePost(@Body Post post);
}
