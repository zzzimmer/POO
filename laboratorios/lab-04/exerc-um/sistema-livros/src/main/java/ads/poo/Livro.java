package ads.poo;

public class Livro {
    private final String ISBN;

    private String titulo,autor,anoPublicacao;

    public Livro(String ISBN, String titulo, String autor, String anoPublicacao) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public Livro(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
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

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString(){
        return "Livro: "+titulo+"\n"+
                "ISBN: "+ISBN+"\n"+
                "Autor: "+autor+"\n"+
                "Ano de publicação: "+anoPublicacao+"\n";
    }
}
