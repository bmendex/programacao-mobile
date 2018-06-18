package thebestbeer.br.com.thebestbeer.models;

import com.google.gson.annotations.SerializedName;

public class Usuario{
    /**
     * @SerializedName mapeia o nome dos campos JSON para JAVA
     */

    @SerializedName("nome")
    protected String mNome = "";

    @SerializedName("email")
    protected String mEmail = "";

    @SerializedName("idade")
    protected String mIdade = "";

    public String getmNome() {
        return mNome;
    }

    public void setmNome(String mNome) {
        this.mNome = mNome;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public String getmIdade() {
        return mIdade;
    }

    public void setmIdade(String mIdade) {
        this.mIdade = mIdade;
    }
}
