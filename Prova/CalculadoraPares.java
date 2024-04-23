package Prova;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculadoraPares {

    public static void main(String[] args) {
        ArrayList pares = new ArrayList();

    }

    public void inserir(ArrayList pares) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos números você deseja inserir?");
        int quantidade = teclado.nextInt();
        int quantidadePares = 0;

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Insira o número");
            int numero = teclado.nextInt();

            if((numero % 2) == 0) {
                pares.add(numero);
                quantidadePares++;
            }
        }

        System.out.println("Quantidade de números pares: " + quantidadePares);
    }

    public int soma(ArrayList pares) {
        int soma = 0;
        for (int i = 0; i < pares.size(); i++) {
            soma += (int) pares.get(i);
        }
        return soma;
    }

    public float dividir(int soma) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual número você deseja dividir a soma dos números pares?");
        int divisor = teclado.nextInt();
        int divisao = 0;
        try {
            divisao = soma / divisor;
        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por 0");
        }
        return divisao;
    }
}
