package thebestbeer.br.com.thebestbeer.models;

import com.google.gson.annotations.SerializedName;

public class Cardapio {

    @SerializedName("descricao_cerveja")
    protected String mDescricaoCerveja;

    @SerializedName("preco_cerveja")
    protected String mPrecoCerveja;

    public String getDescricaoCerveja() {
        return mDescricaoCerveja;
    }

    public Cardapio setDescricaoCerveja(String mDescricaoCerveja) {
        this.mDescricaoCerveja = mDescricaoCerveja;
        return this;
    }

    public String getPrecoCerveja() {
        return mPrecoCerveja;
    }

    public Cardapio setPrecoCerveja(String mPrecoCerveja) {
        this.mPrecoCerveja = mPrecoCerveja;
        return this;
    }
}
