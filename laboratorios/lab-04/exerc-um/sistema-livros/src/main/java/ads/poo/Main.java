package ads.poo;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private ArrayList<Livro> bancoDadosLivro;

    public String cadastrarLivro(String ISBN, String autor, String anoPublicacao, String titulo){
        Livro livro = new Livro(ISBN,titulo,autor,anoPublicacao);
        bancoDadosLivro.add(livro);
        return "Livro: "+ titulo + "\ncadastrado com sucesso.";
    }

    public String listarTodosISBNeTitulo(){
        StringBuilder dado = new StringBuilder();
        for (Livro livro : bancoDadosLivro) {
            dado.append(String.format("ISBN: %s, Titulo: %s",livro.getISBN(),livro.getTitulo()));
        }
        return dado.toString();
    }

    public String consultaISBN(String ISBN){
        for (Livro livro : bancoDadosLivro){
            if (livro.getISBN().equals(ISBN)){
                return livro.toString();
            }
        }
        return "ISBN não consta no banco";
    }

    public String consultaAutor(String autor){
        StringBuilder retorno = new StringBuilder();
        for (Livro livro : bancoDadosLivro){
            if (livro.getAutor().equals(autor)){
                return retorno.append(String.
                        format("ISBN: %s, Título: %s",livro.getISBN(),livro.getTitulo())).
                        toString();
            }
        }
        return "Autor não consta na base de dados";
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Sitema de Livros");


    }
}