package Array;

import java.util.Scanner;

public class Ex9ArrayControle {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o tamanho do array que você deseja criar?");
        int n = teclado.nextInt();
        Ex9Array teste = new Ex9Array(n);

        for (int i = 1; i <= n; i++) {

            System.out.println("Digite o " + i + "º valor: ");
            int valor = teclado.nextInt();

            if (!teste.adicionar(valor)) {
                System.out.println("Tamanho máximo atingido");
                break;
            }
        }

        System.out.println("Média dos números: " + teste.calculaMedia());

    }

}