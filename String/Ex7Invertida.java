package String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex7Invertida {

    String string;

    public static void main(String[] args) {

        Ex7Invertida teste = new Ex7Invertida();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreva uma frase para ser invertida: ");
        teste.setString(teclado.nextLine());

        char array[] = teste.getString().toCharArray();

        List<String> invertida = new ArrayList<>();
        for (int i = array.length - 1; i >= 0 ; i--) {

            invertida.add(String.valueOf(array[i]));
        }

        for (int i = 0; i < invertida.size(); i++) {

            System.out.print(invertida.get(i));
        }
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
