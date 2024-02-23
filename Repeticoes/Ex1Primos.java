package Repeticoes;

import java.util.Scanner;

public class Ex1Primos {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = teclado.nextInt();

        if(numeroPrimo(n) == true) {

            System.out.println("É primo");
        } else {

            System.out.println("Não é primo");
        }
    }

    private static boolean numeroPrimo(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
