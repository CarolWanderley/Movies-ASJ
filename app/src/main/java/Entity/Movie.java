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

    public String getAno() {
        return ano;
    }

    public String getDuracao() {
        return duracao;
    }

    public String getNota() {
        return nota;
    }

    public int getDescricao() {
        return descricao;
    }

    public String getTrailer() {
        return trailer;
    }

    public int getImageAddress() {
        return imageAddress;
    }
}
