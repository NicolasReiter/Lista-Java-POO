package Repeticoes;

import java.util.*;

public class Ex3Permuta {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        boolean permuta = false;

        System.out.println("Digite o 1º número para ver se é permutação");
        int numero1 = teclado.nextInt();
        System.out.println("Digite o 2º número para ver se é permutação");
        int numero2 = teclado.nextInt();

        String stringNumero1 = String.valueOf(numero1);
        String stringNumero2 = String.valueOf(numero2);

        char vetor1[] = stringNumero1.toCharArray();
        char vetor2[] = stringNumero2.toCharArray();

        Arrays.sort(vetor1);
        Arrays.sort(vetor2);

        List<String> copia1 = new ArrayList<>();
        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] != '0') {
                copia1.add(String.valueOf(vetor1[i]));
            }
        }

        List<String> copia2 = new ArrayList<>();
        for (int i = 0; i < vetor2.length; i++) {
            if (vetor2[i] != '0') {
                copia2.add(String.valueOf(vetor2[i]));
            }
        }

        for (int i = 0; i < copia1.size(); i++) {
            if (!Objects.equals(copia1.get(i), copia2.get(i))) {

                break;
            }

            permuta = true;
        }

        if (permuta == true) {

            System.out.println("É permutação");
        } else {

            System.out.println("Não é permutação");
        }
    }
}
