package thebestbeer.br.com.the_best_beer.models;

import com.google.gson.annotations.SerializedName;

public class Avaliacao {


    @SerializedName("descricao_cerveja")
    protected String mDescricaoCerveja;

    @SerializedName("aroma_cerv")
    protected String mAromaCerveja;

    @SerializedName("sabor_cerv")
    protected String mSaborCerveja;

    @SerializedName("sensacao_cerv")
    protected String mSensacaoCerveja;

    @SerializedName("aparencia_cerv")
    protected String mAparenciaCerveja;

    @SerializedName("descricao_comentario")
    protected String mDescricaoComentario;

    @SerializedName("satisfacao_cerv")
    protected String mSatisfacaoCerveja;

    @SerializedName("img_cerveja")
    protected String mFotoCervAval;

    @SerializedName("descricao_familia")
    protected String mDescricaoFamilia;

    @SerializedName("estilo_cerveja")
    protected String mEstiloCerveja;

    public String getDescricaoFamilia() {
        return mDescricaoFamilia;
    }

    public Avaliacao setDescricaoFamilia(String mDescricaoFamilia) {
        this.mDescricaoFamilia = mDescricaoFamilia;
        return this;
    }

    public String getEstiloCerveja() {
        return mEstiloCerveja;
    }

    public Avaliacao setEstiloCerveja(String mEstiloCerveja) {
        this.mEstiloCerveja = mEstiloCerveja;
        return this;
    }

    public String getFotoCervAval() {
        return mFotoCervAval;
    }

    public Avaliacao setFotoCervAval(String mFotoCervAval) {
        this.mFotoCervAval = mFotoCervAval;
        return this;
    }

    public String getDescricaoCerveja() {
        return mDescricaoCerveja;
    }

    public Avaliacao setDescricaoCerveja(String mDescricaoCerveja) {
        this.mDescricaoCerveja = mDescricaoCerveja;
        return this;
    }

    public String getAromaCerveja() {
        return mAromaCerveja;
    }

    public Avaliacao setAromaCerveja(String mAromaCerveja) {
        this.mAromaCerveja = mAromaCerveja;
        return this;
    }

    public String getSaborCerveja() {
        return mSaborCerveja;
    }

    public Avaliacao setSaborCerveja(String mSaborCerveja) {
        this.mSaborCerveja = mSaborCerveja;
        return this;
    }

    public String getSensacaoCerveja() {
        return mSensacaoCerveja;
    }

    public Avaliacao setSensacaoCerveja(String mSensacaoCerveja) {
        this.mSensacaoCerveja = mSensacaoCerveja;
        return this;
    }

    public String getAparenciaCerveja() {
        return mAparenciaCerveja;
    }

    public Avaliacao setAparenciaCerveja(String mAparenciaCerveja) {
        this.mAparenciaCerveja = mAparenciaCerveja;
        return this;
    }

    public String getDescricaoComentario() {
        return mDescricaoComentario;
    }

    public Avaliacao setDescricaoComentario(String mDescricaoComentario) {
        this.mDescricaoComentario = mDescricaoComentario;
        return this;
    }

    public String getSatisfacaoCerveja() {
        return mSatisfacaoCerveja;
    }

    public Avaliacao setSatisfacaoCerveja(String mSatisfacaoCerveja) {
        this.mSatisfacaoCerveja = mSatisfacaoCerveja;
        return this;
    }
}
