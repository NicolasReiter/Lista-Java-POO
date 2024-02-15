import java.util.Scanner;

public class Ex2Sorteio {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numAleatorio = (int) ((Math.random() * 1000) + 1);

        boolean loop = true;

        int erros = 0;

        while(loop == true) {

            System.out.println("Palpite um número: ");
            int palpite = teclado.nextInt();

            if(palpite == numAleatorio) {

                System.out.println("Você acertou o número!!");
                break;
            } else if(palpite < numAleatorio) {

                System.out.println("Palpite menor que o número sorteado");

                erros += 1;
            } else if(palpite > numAleatorio) {

                System.out.println("Palpite maior que número sorteado");

                erros += 1;
            }
        }

        System.out.println("Quantidade de vezes que você errou: " + erros);
    }
}
