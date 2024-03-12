package EstruturasDeDados.Ex1;

import java.util.Scanner;

public class Controle {
    Empregado empregado = new Empregado();

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Empregado empregado = new Empregado();

        empregado.armazena();
        empregado.organizaSalario();

        System.out.println("Você quer apagar um cpf?");
        String resposta = teclado.next();
        switch (resposta) {
            case "Sim":
                System.out.println("Qual cpf desejas remover?");
                int desempregado = teclado.nextInt();
                empregado.remover(desempregado);
                break;
            case "Não":
                System.out.println("Programa encerrado");
                break;
        }
    }
}
