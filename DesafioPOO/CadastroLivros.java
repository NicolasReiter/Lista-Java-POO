package DesafioPOO;

import java.util.Scanner;

public class CadastroLivros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        BookRepository repositorio = new BookRepository();

        //Quantidade de livros
        System.out.println("Quantos livros que você deseja cadastrar?");
        int quantidade = teclado.nextInt();

        //Cria e cadastra os livros
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Qual o código do livro?");
            String codigo = teclado.next();
            System.out.println("Qual o título do livro?");
            String titulo = teclado.next();
            System.out.println("Qual o autor do livro?");
            String autor = teclado.next();
            System.out.println("Qual o ano de publicação do livro?");
            int anoPublicacao = teclado.nextInt();

            Livro livro = new Livro(codigo, titulo, autor, anoPublicacao);
            repositorio.addBook(livro);
        }

        //Pesquisa dos livros
        while(true) {
            System.out.println("Qual livro você quer pesquisar?");
            String codigoPesquisa = teclado.next();
            if (codigoPesquisa.equals("fim")) {
                break;
            }
            repositorio.searchBookByCode(codigoPesquisa);
        }
    }
}
