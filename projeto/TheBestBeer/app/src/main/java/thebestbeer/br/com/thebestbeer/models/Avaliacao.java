package thebestbeer.br.com.thebestbeer.models;

import com.google.gson.annotations.SerializedName;

public class Avaliacao {


    @SerializedName("descricao_cerveja")
    protected String mDescricaoCervejaAvaliacao;

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

    public String getFotoCervAval() {
        return mFotoCervAval;
    }

    public Avaliacao setFotoCervAval(String mFotoCervAval) {
        this.mFotoCervAval = mFotoCervAval;
        return this;
    }

    public String getDescricaoCervejaAvaliacao() {
        return mDescricaoCervejaAvaliacao;
    }

    public Avaliacao setDescricaoCervejaAvaliacao(String mDescricaoCervejaAvaliacao) {
        this.mDescricaoCervejaAvaliacao = mDescricaoCervejaAvaliacao;
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
