package thebestbeer.br.com.thebestbeer.networks;

import com.google.gson.annotations.SerializedName;

public class WebserviceResponse<T> {

    @SerializedName("RestResponse")
    protected RestResponse<T> mResponse;

    public RestResponse<T> getmResponse() {
        return mResponse;
    }

    public void setmResponse(final RestResponse<T> response) {
        this.mResponse = response;
    }
}
