package thebestbeer.br.com.thebestbeer.networks;

public class WebserviceResponse<T> {

    protected RestResponse<T> mResponse;

    public RestResponse<T> getmResponse() {
        return mResponse;
    }

    public void setmResponse(final RestResponse<T> response) {
        this.mResponse = response;
    }
}
