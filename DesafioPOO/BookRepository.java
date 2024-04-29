package DesafioPOO;

import DesafioPOO.Exceptions.LivroNaoEncontradoException;

import java.util.HashMap;

public class BookRepository {
    HashMap<String, Livro> livros = new HashMap<>();

    public void addBook(Livro livro) {
        try {
            if (livros.containsKey(livro.getCodigo())) {
                throw new IllegalArgumentException();
            } else {
                livros.put(livro.getCodigo(), livro);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Código do livro deve ser único!!");
        }
    }

    public void searchBookByCode(String codigo){
        try {
            if (livros.containsKey(codigo)) {
                livros.get(codigo).exibirInformacoes();
            } else {
                throw new LivroNaoEncontradoException();
            }
        } catch (LivroNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }
}
