package DesafioPOO;

public class Livro {

    String codigo;
    String titulo;
    String autor;
    int anoPublicacao;

    public Livro(String codigo, String titulo, String autor, int anoPublicacao) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public void exibirInformacoes() {
        System.out.println("Código do livro: " + this.getCodigo() + "\n"
                + "Título: " + this.getTitulo() + "\n"
                + "Autor: " + this.getAutor() + "\n"
                + "Ano de publicação: " + this.getAnoPublicacao());
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}
