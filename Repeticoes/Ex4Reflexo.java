package Repeticoes;

import java.util.Scanner;

public class Ex4Reflexo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Você está pronto para o jogar?(Sim - S, Não - N)");
        String pronto = teclado.next().toUpperCase();

        if (pronto.equals("S")) {

            int tempoAleatorio = (int) ((Math.random() * 10) + 1);
            int numAleatorio = (int) ((Math.random() * 100) + 1);

            try {
                Thread.sleep((tempoAleatorio * 1000));
                System.out.println("Agora, " + numAleatorio + "\n" + "Digite o número que apareceu acima: s");
                int tempoInicial = (int) System.currentTimeMillis();
                int resposta = teclado.nextInt();
                int tempoFinal = (int) System.currentTimeMillis();

                System.out.println("Você demorou " + (tempoFinal - tempoInicial) + " milisegundos para digitar o número " + resposta);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else if (pronto.equals("N")) {

            System.out.println("Jogo cancelado");
        }
    }
}
