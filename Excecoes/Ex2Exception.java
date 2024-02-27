package Excecoes;

import java.util.Scanner;

public class Ex2Exception {
    public static void main(String[] args) throws MenorQueException, MaiorQueException {

        Scanner teclado = new Scanner(System.in);
        int numAleatorio = (int) ((Math.random() * 1000) + 1);

        int erros = 0;

        while(true) {

            System.out.println("Palpite um número: ");
            int palpite = teclado.nextInt();

            if(palpite == numAleatorio) {

                System.out.println("Você acertou o número!!");
                break;
            } else if(palpite < numAleatorio) {

                erros += 1;
                throw new MenorQueException();
            } else if(palpite > numAleatorio) {

                erros += 1;
                throw new MaiorQueException();
            }
        }

        System.out.println("Quantidade de vezes que você errou: " + erros);
    }
}
