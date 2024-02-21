package String;

import java.util.Scanner;

public class Ex6Abreviatura {

    String nome;

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Ex6Abreviatura teste = new Ex6Abreviatura();

        System.out.println("Escreva seu nome: ");
        teste.setNome(teclado.nextLine());

        String array[] = teste.getNome().split(" ");

        for (int i = 0; i < array.length; i++) {

            teste.setNome(String.valueOf(array[i].charAt(0)));

            if (String.valueOf(array[i]).equals("de")) {

                System.out.print("de ");
            } else {

            System.out.print(teste.getNome() + ". ");
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
