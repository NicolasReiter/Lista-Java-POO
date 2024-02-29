package Fluxos;

import java.io.*;
import java.util.Scanner;

public class Ex14Escola {

    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        double notasTotal = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Qual o seu nome?");
            String nome = teclado.next();
            System.out.println("Digite seu código:");
            int codigo = teclado.nextInt();
            System.out.println("Qual foi a sua 1º nota?");
            int nota1 = teclado.nextInt();
            System.out.println("Qual foi a sua 2º nota?");
            int nota2 = teclado.nextInt();
            int tamanhoNome = nome.length();
            notasTotal += (nota1 + nota2) / 2;

            escreverArquivo(nome, codigo, nota1, nota2, tamanhoNome);
            lerArquivo(nome, codigo, nota1, nota2, tamanhoNome);
        }
        System.out.println("Média da turma: " + (notasTotal / 3));
    }
    public static void escreverArquivo(String nome, int codigo, int nota1, int nota2, int tamanhoNome) throws IOException{
        try (DataOutputStream escrever = new DataOutputStream(new FileOutputStream("C:\\Users\\nicolas.reiter\\IdeaProjects\\Lista-Java-POO\\Fluxos\\" + codigo + ".txt"))) {
            escrever.write(nome.getBytes());
            escrever.write("\n".getBytes());
            escrever.writeInt(tamanhoNome);
            escrever.writeInt(nota1);
            escrever.writeInt(nota2);
        } catch (FileNotFoundException e) {
            System.out.println("Output do arquivo não abre");
        }
    }
    public static void lerArquivo(String nome, int codigo, int nota1, int nota2, int tamanhoNome) throws IOException{
        try (DataInputStream ler = new DataInputStream(new FileInputStream("C:\\Users\\nicolas.reiter\\IdeaProjects\\Lista-Java-POO\\Fluxos\\" + codigo + ".txt"))) {
            nome = ler.readLine();
            System.out.println("Seu nome: " + nome);
            tamanhoNome = ler.readInt();
            System.out.println("Tamanho do nome: " + tamanhoNome);
            nota1 = ler.readInt();
            System.out.println("Valor da sua primeira nota: " + nota1);
            nota2 = ler.readInt();
            System.out.println("Valores da sua segunda nota: " + nota2);
        } catch (FileNotFoundException e) {
            System.out.println("Input do arquivo não abre");
        }
        double mediaAluno = (double) (nota1 + nota2) / 2;

        if (mediaAluno > 6) {
            System.out.println("Você foi APROVADO com a média: " + mediaAluno);
        } else if (mediaAluno < 4) {
            System.out.println("Você foi REPROVADO com a média: " + mediaAluno);
        } else {
            System.out.println("Você foi pra EXAME com a média: " + mediaAluno);
        }
    }
}
