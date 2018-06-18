package thebestbeer.br.com.thebestbeer.networks;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class RestResponse<T> {

    @SerializedName("messages")
    protected List<String> mMassages = new ArrayList<>();

    @SerializedName("result")
    protected T mResult;

    public List<String> getmMassages() {
        return mMassages;
    }

    public void setmMassages(List<String> mMassages) {
        this.mMassages = mMassages;
    }

    public T getmResult() {
        return mResult;
    }

    public void setmResult(T mResult) {
        this.mResult = mResult;
    }
}
