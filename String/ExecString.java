package String;

import java.util.Scanner;

public class ExecString {

    String frase1;
    String frase2;
    Scanner teclado = new Scanner(System.in);

    public void main(String[] args) {


        System.out.println("Escreva a primeira frase: ");
        setFrase1(teclado.next().toLowerCase());
        System.out.println("Escreva a segunda frase: ");
        setFrase2(teclado.next().toLowerCase());

        if(getFrase1().contains(getFrase2())) {

            System.out.println("Contem");
        }
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