package Excecoes;

import java.util.Scanner;

public class Ex2Exception {
    public static void main(String[] args) throws MenorQueException, MaiorQueException {

        Scanner teclado = new Scanner(System.in);
        int numAleatorio = (int) ((Math.random() * 10) + 1);

        int erros = 0;

        while(true) {

            System.out.println("Palpite um número: ");
            int palpite = teclado.nextInt();

            if(palpite == numAleatorio) {

                System.out.println("Você acertou o número!!");
                break;
            } else if (palpite <  numAleatorio){
                try {
                    throw new MenorQueException();
                } catch (MenorQueException e) {
                    erros += 1;
                    System.out.println(e.getMessage());
                }
            } else if (palpite > numAleatorio) {
                try {
                    throw new MaiorQueException();
                } catch (MaiorQueException e) {
                    erros += 1;
                    System.out.println(e.getMessage());
                }
            }
        }

        System.out.println("Quantidade de vezes que você errou: " + erros);
    }
}
