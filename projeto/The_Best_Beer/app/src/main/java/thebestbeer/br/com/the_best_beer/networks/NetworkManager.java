package thebestbeer.br.com.the_best_beer.networks;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkManager {

    private static final String URL = "http://10.10.26.212/";

    private static NetworkManager sInstance = new NetworkManager();

    private final Retrofit mRetrofit;
    private final RestService mRestService;

    private NetworkManager(){
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        mRetrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        mRestService = mRetrofit.create(RestService.class);
    }

    public static NetworkManager getsInstance(){
        if(sInstance == null) sInstance = new NetworkManager();
        return sInstance;
    }


    public static RestService service(){
        return getsInstance().mRestService;
    }

}
