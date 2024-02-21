package String;

import java.util.*;

public class ExecString {

    String frase1;
    String frase2;

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ExecString teste = new ExecString();
        
        System.out.println("Escreva a primeira frase: ");
        teste.setFrase1(teclado.nextLine().toLowerCase());
        System.out.println("Escreva a segunda frase: ");
        teste.setFrase2(teclado.nextLine().toLowerCase());

        char[] array1 = teste.getFrase1().toCharArray();
        char[] array2 = teste.getFrase2().toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        List<String> copia1 = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != ' ') {
                copia1.add(String.valueOf(array1[i]));
            }
        }

        List<String> copia2 = new ArrayList<>();
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] != ' ') {
                copia2.add(String.valueOf(array2[i]));
            }
        }

        if(copia1.containsAll(copia2)) {

            System.out.println("Contem");
        } else {

            System.out.println("Não contem");
        }

        copia1.addAll(copia2);
        Collections.sort(copia1);

        System.out.println(copia1.get(1));

        for (int i = 0; i < copia1.size(); i++) {

            System.out.println(copia1.get(i) + ": " + teste.contar((ArrayList) copia1));
        }
    }

    public int contar(ArrayList frase) {

        int count = 0;
        for (int i = 0; i < frase.size(); i++) {
            count = 0;
            String procurado = (String) frase.get(i);
            for ( int j = 0 ; j < frase.size() ; j++ ) {
                if ( frase.get(j) == procurado ) {
                    count += 1;
                }
            }
        }
        return count;
    }

    public String getFrase1() {
        return frase1;
    }
    public void setFrase1(String frase1) {
        this.frase1 = frase1;
    }
    public String getFrase2() {
        return frase2;
    }
    public void setFrase2(String frase2) {

        this.frase2 = frase2;
    }
}