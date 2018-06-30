package thebestbeer.br.com.thebestbeer.models;

import com.google.gson.annotations.SerializedName;

import java.text.NumberFormat;
import java.util.Locale;

public class Cervejas {

    @SerializedName("descricao_familia")
    protected String mNomeFamiliaCerveja = "";

    @SerializedName("descricao_cerveja")
    protected String mDescricaoCerveja = "";

    @SerializedName("descricao_fabricante")
    protected String mDescricaoFabricante = "";

    @SerializedName("teor_cerveja")
    protected String mTeorAlcoolico = "";

    @SerializedName("ibu_cerveja")
    protected String mIbuCerveja = "";

    @SerializedName("img_cerveja")
    protected String urlFoto = "";

    @SerializedName("estilo_cerveja")
    protected String mEstiloCerveja = "";

    @SerializedName("ingredientes")
    protected String mIngrdientes;

    @SerializedName("sazonal")
    protected String mSazonal;

    @SerializedName("corpo_ideal")
    protected String mCorpoIdeal;

    @SerializedName("cor_srm")
    protected float mCorSrm;

    @SerializedName("temperatura")
    protected String mTemperatura;


    public String getIngrdientes() {
        return mIngrdientes;
    }

    public Cervejas setIngrdientes(String mIngrdientes) {
        this.mIngrdientes = mIngrdientes;
        return this;
    }

    public String getSazonal() {
        return mSazonal;
    }

    public Cervejas setSazonal(String mSazonal) {
        this.mSazonal = mSazonal;
        return this;
    }

    public String getCorpoIdeal() {
        return mCorpoIdeal;
    }

    public Cervejas setCorpoIdeal(String mCorpoIdeal) {
        this.mCorpoIdeal = mCorpoIdeal;
        return this;
    }

    public String getCorSrm() {
        return String.valueOf(mCorSrm);
    }


    public Cervejas setCorSrm(float mCorSrm) {
        this.mCorSrm = mCorSrm;
        return this;
    }

    public String getTemperatura() {
        return mTemperatura + "ºC";
    }

    public Cervejas setTemperatura(String mTemperatura) {
        this.mTemperatura = mTemperatura;
        return this;
    }

    public String getNomeFamiliaCerveja() {
        return mNomeFamiliaCerveja;
    }

    public void setNomeFamiliaCerveja(String mNomeFamiliaCerveja) {
        this.mNomeFamiliaCerveja = mNomeFamiliaCerveja;
    }

    public String getDescricaoCerveja() {
        return mDescricaoCerveja;
    }

    public void setDescricaoCerveja(String mDescricaoCerveja) {
        this.mDescricaoCerveja = mDescricaoCerveja;
    }

    public String getDescricaoFabricante() {
        return mDescricaoFabricante;
    }

    public void setDescricaoFabricante(String mDescricaoFabricante) {
        this.mDescricaoFabricante = mDescricaoFabricante;
    }

    public String getTeorAlcoolico() {
        return mTeorAlcoolico + "% ABV";
    }

    public void setTeorAlcoolico(String mTeorAlcoolico) {
        this.mTeorAlcoolico = mTeorAlcoolico;
    }

    public String getIbuCerveja() {
        return mIbuCerveja;
    }

    public void setIbuCerveja(String mIbuCerveja) {
        this.mIbuCerveja = mIbuCerveja;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public String getEstiloCerveja() {
        return mEstiloCerveja;
    }

    public void setEstiloCerveja(String estiloCerveja) {
        mEstiloCerveja = estiloCerveja;
    }
}
