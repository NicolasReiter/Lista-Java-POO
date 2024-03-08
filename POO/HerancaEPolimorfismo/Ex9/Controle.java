package POO.HerancaEPolimorfismo.Ex9;

import java.util.Scanner;

public class Controle {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Você deseja instanciar um aluno ou uma pessoa?");
        String instancia = teclado.next().toLowerCase();

        switch (instancia) {
            case "pessoa":
                System.out.println("Qual o nome dessa pessoa?");
                String nomePessoa = teclado.next();
                System.out.println("Qual a idade da pessoa?");
                int idadePessoa = teclado.nextInt();
                Pessoa pessoa = new Pessoa(nomePessoa, idadePessoa);
                pessoa.mostraDados();
                break;
            case "aluno":
                System.out.println("Qual o nome desse aluno?");
                String nomeAluno = teclado.next();
                System.out.println("Qual a idade do aluno?");
                int idadeAluno = teclado.nextInt();
                System.out.println("Qual o curso do aluno?");
                String curso = teclado.next();
                Aluno aluno =  new Aluno(nomeAluno, idadeAluno, curso);
                aluno.mostraDados();
        }
    }
}
