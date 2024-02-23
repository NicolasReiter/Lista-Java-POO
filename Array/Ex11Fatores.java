package Array;

import java.util.Scanner;

public class Ex11Fatores {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número para ele ser fatorado: ");
        int numero = teclado.nextInt();
        fatoresPrimos(numero);
    }

    public static void fatoresPrimos(int numero) {

        while (numero % 2 == 0) {

            System.out.print(2 + " ");
            numero = numero / 2;
        }

        for (int i = 3; i <= numero; i += 2) {

            while(numero % i == 0) {

                System.out.print(i + " ");
                numero = numero / i;
            }
        }

        if (numero > 2) {
            System.out.print(numero);
        }
    }
}
