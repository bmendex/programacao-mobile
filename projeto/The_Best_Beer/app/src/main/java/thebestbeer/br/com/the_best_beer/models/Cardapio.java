package thebestbeer.br.com.the_best_beer.models;

import com.google.gson.annotations.SerializedName;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Cardapio {

    @SerializedName("descricao_cerveja")
    protected String mDescricaoCerveja;

    @SerializedName("preco_cerveja")
    protected float mPrecoCerveja;

    @SerializedName("img_cardapio")
    protected String mFotoCardapio;

    @SerializedName("descricao_familia")
    protected String mDescricaoFamilia;

    public String getDescricaoFamilia() {
        return mDescricaoFamilia;
    }

    public Cardapio setDescricaoFamilia(String mDescricaoFamilia) {
        this.mDescricaoFamilia = mDescricaoFamilia;
        return this;
    }

    public String getFotoCardapio() {
        return mFotoCardapio;
    }

    public Cardapio setFotoCardapio(String mFotoCardapio) {
        this.mFotoCardapio = mFotoCardapio;
        return this;
    }

    public String getDescricaoCerveja() {
        return mDescricaoCerveja;
    }

    public Cardapio setDescricaoCerveja(String mDescricaoCerveja) {
        this.mDescricaoCerveja = mDescricaoCerveja;
        return this;
    }

    public float getPrecoCerveja() {
        return mPrecoCerveja;
    }

    public Cardapio setPrecoCerveja(float mPrecoCerveja) {
        this.mPrecoCerveja = mPrecoCerveja;
        return this;
    }

    public String getPrecoCervejaStr(){
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.getDefault());
        format.setCurrency(Currency.getInstance("BRL"));
        String result = format.format(mPrecoCerveja);
        return result;
    }
}
