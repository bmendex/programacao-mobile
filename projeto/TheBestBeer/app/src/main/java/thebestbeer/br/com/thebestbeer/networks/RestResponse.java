package thebestbeer.br.com.thebestbeer.networks;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class RestResponse<T> {

    @SerializedName("messages")
    protected List<String> mMassages = new ArrayList<>();

    @SerializedName("result")
    protected T mResult;

    public List<String> getMassages() {
        return mMassages;
    }

    public void setMassages(List<String> massages) {
        mMassages = massages;
    }

    public T getResult() {
        return mResult;
    }

    public void setResult(T result) {
        mResult = result;
    }
}
