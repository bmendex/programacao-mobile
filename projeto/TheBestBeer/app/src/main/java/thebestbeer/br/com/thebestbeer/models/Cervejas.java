package thebestbeer.br.com.thebestbeer.models;

import com.google.gson.annotations.SerializedName;

public class Cervejas {

    @SerializedName("nome_familia_cerveja")
    private String mNomeFamiliaCerveja = "";

    @SerializedName("descricao_cerveja")
    private String mDescricaoCerveja = "";

    @SerializedName("descricao_fabricante")
    private String mDescricaoFabricante = "";

    @SerializedName("teor_alcoolico")
    private String mTeorAlcoolico = "";

    @SerializedName("ibu_cerveja")
    private String mIbuCerveja = "";

    @SerializedName("url_fotos")
    private String urlFoto = "";

    @SerializedName("sobre_cerveja")
    private String mSobreCerveja = "";

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
        return mTeorAlcoolico;
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

    public String getSobreCerveja() {
        return mSobreCerveja;
    }

    public void setSobreCerveja(String mSobreCerveja) {
        this.mSobreCerveja = mSobreCerveja;
    }

    public void setDescricaoCerveja() {
    }
}
