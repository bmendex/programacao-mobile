package thebestbeer.br.com.thebestbeer.networks;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class WebserviceResponse<T> {

    @SerializedName("date")
    protected Date mData;

    @SerializedName("status")
    protected int mStatus;

    @SerializedName("message")
    protected String mMessage;

    @SerializedName("object")
    protected T mObject;

    public Date getData() {
        return mData;
    }

    public void setData(Date data) {
        mData = data;
    }

    public int getStatus() {
        return mStatus;
    }

    public void setStatus(int status) {
        mStatus = status;
    }

    public String getMessage() {
        return mMessage;
    }

    public void setMessage(String message) {
        mMessage = message;
    }

    public T getObject() {
        return mObject;
    }

    public void setObject(T object) {
        mObject = object;
    }
}
