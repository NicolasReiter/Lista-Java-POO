package Repeticoes;

import java.util.Scanner;

public class Ex1Primos {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = teclado.nextInt();

        if(ehPrimo(n) == true) {

            System.out.println("É primo");
        } else {

            System.out.println("Não é primo");
        }
    }

    private static boolean ehPrimo(int n) {
        for (int j = 2; j < n; j++) {
            if (n % j == 0)
                return false;
        }
        return true;
    }
}
