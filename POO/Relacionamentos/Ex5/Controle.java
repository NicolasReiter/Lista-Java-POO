package POO.Relacionamentos.Ex5;

import POO.Relacionamentos.Ex5.Aluno;

import java.util.ArrayList;
import java.util.Scanner;

public class Controle {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Aluno> classe = new ArrayList();

        int totalNotas = 0;
        int qtdeAprovados = 0;
        int qtdeReprovados = 0;
        int qtdeProvaFinal = 0;

        while(true) {
            Aluno aluno = new Aluno();

            System.out.println("Qual o nome do aluno?");
            String nome = teclado.next();
            if (nome.equals("fim")) {
                System.out.println("Programa finalizado!!!");
                break;
            }
            System.out.println("Qual a primeira nota?");
            int nota1 = teclado.nextInt();
            System.out.println("Qual a segunda nota?");
            int nota2 = teclado.nextInt();

            aluno.setNome(nome);
            aluno.setNotaParcial1(nota1);
            aluno.setNotaParcial2(nota2);
            classe.add(aluno);

            totalNotas += (aluno.getNotaParcial1() + aluno.getNotaParcial2());
        }

        double mediaTurma = (double) totalNotas / classe.size();

        for (int i = 0; i < classe.size(); i++) {
            Aluno alunoCopia;
            alunoCopia = classe.get(i);

            if (((alunoCopia.getNotaParcial1() + alunoCopia.getNotaParcial2()) / 2) > 60) {
                qtdeAprovados++;
            } else if (((alunoCopia.getNotaParcial1() + alunoCopia.getNotaParcial2()) / 2) < 40) {
                qtdeReprovados++;
            } else {
                qtdeProvaFinal++;
            }

            if (alunoCopia.getNotaParcial1() + alunoCopia.getNotaParcial2() < mediaTurma) {
                System.out.println("Aluno com notas abaixo da média da turma: " + alunoCopia.getNome());
            }
        }

        System.out.println("\n Quantidade de alunos que foram aprovados: " + qtdeAprovados
                + "\n Quantidade de alunos que foram reprovados: " + qtdeReprovados
                + "\n Quantidade de alunos que fora fazer a prova final: " + qtdeProvaFinal);
    }
}
