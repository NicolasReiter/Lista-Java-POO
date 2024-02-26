package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Ex12Distancia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int bidimensional[][] = new int[5][5];
        inserirMatriz(bidimensional);
        escrever(bidimensional);

        System.out.println("Por quantas cidade você passou?");
        int quantidade  = teclado.nextInt();
        int[] caminho = new int[quantidade];
        calcularPercurso(caminho, bidimensional);

    }

    public static void inserirMatriz(int bidimensional[][]) {
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (bidimensional[i][j] != 0) {

                    bidimensional[i][j] = bidimensional[i][j];
                } else if (i == j) {

                    bidimensional[i][j] = 0;
                } else {

                    System.out.println("Insira a distância da cidade " + (i + 1) + " para a cidade " + (j + 1));
                    int distancia = teclado.nextInt();

                    bidimensional[i][j] = distancia;
                    bidimensional[j][i] = distancia;
                }
            }
        }
    }

    public static void escrever(int bidimensional[][]) {

        for (int i = 0; i < 5; i++) {

            System.out.println(Arrays.toString(bidimensional[i]));
        }
    }

    public static void calcularPercurso(int caminho[], int bidimensional[][]) {
        Scanner teclado = new Scanner(System.in);
        int totalPercuso = 0;

        for (int i = 0; i < caminho.length; i++) {

            System.out.println("Em qual cidade você está?");
            int cidade = teclado.nextInt();

            caminho[i] = cidade;
        }

        for (int i = 0; i < caminho.length - 1; i++) {

            totalPercuso += bidimensional[(caminho[i] - 1)][(caminho[i + 1] - 1)];
        }

        System.out.println("Total de km no percurso " + totalPercuso + " km");
    }
}
