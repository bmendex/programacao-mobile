package thebestbeer.br.com.thebestbeer.models;

import com.google.gson.annotations.SerializedName;

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

    public String getEstiloCerveja() {
        return mEstiloCerveja;
    }

    public void setEstiloCerveja(String estiloCerveja) {
        mEstiloCerveja = estiloCerveja;
    }
}
