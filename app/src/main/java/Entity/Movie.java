package Entity;

/**
 * Created by Carol on 29/04/2016.
 */
public class Movie {
    private String titulo;
    private String ano;
    private String duracao;
    private String nota;
    private int descricao;
    private String trailer;
    private int imageAddress;

    public Movie(String titulo, String ano, String duracao, String nota, String trailer, int descricao, int imageAddress) {
        this.titulo = titulo;
        this.ano = ano;
        this.duracao = duracao;
        this.nota = nota;
        this.descricao = descricao;
        this.trailer = trailer;
        this.imageAddress = imageAddress;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public int getDescricao() {
        return descricao;
    }

    public void setDescricao(int descricao) {
        this.descricao = descricao;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public int getImageAddress() {
        return imageAddress;
    }

    public void setImageAddress(int imageAddress) {
        this.imageAddress = imageAddress;
    }
}
