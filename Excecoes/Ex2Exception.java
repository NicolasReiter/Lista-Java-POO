package Excecoes;

import java.util.Scanner;

public class Ex2Exception {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numAleatorio = (int) ((Math.random() * 10) + 1);

        int erros = 0;

        while(true) {

            System.out.println("Palpite um número: ");
            int palpite = teclado.nextInt();

            try {
                if (verifica(palpite, numAleatorio)) {

                    System.out.println("Você acertou");
                    break;
                }
            } catch (MenorQueException e) {

                System.out.println(e.getMessage());
                erros++;
            } catch (MaiorQueException e) {

                System.out.println(e.getMessage());
                erros++;
            }
        }

        System.out.println("Quantidade de vezes que você errou: " + erros);
    }

    public static boolean verifica(int palpite, int numAleatorio) throws MenorQueException, MaiorQueException {

        if (palpite < numAleatorio) {
            throw new MenorQueException();
        } else if (palpite > numAleatorio) {
            throw new MaiorQueException();
        }

        return true;
    }
}
