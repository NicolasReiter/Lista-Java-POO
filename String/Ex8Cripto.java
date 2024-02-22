package String;

import java.util.Scanner;

public class Ex8Cripto {

    String texto;

    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);

        System.out.println("Escreva o texto que vai ser criptografado: ");
        String texto = teclado.nextLine();

        String textoCriptografado = codificar(texto);
        String textoDescriptografado = decodificar(textoCriptografado);

        System.out.println("Texto criptografado: " + textoCriptografado);
        System.out.println("Texto descriptografado: " + textoDescriptografado);

    }

    public static String codificar(String texto) {
        StringBuilder criptografado = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            int valorASCII = ((int) texto.charAt(i) + 1);

            if (valorASCII == 33) {

                valorASCII = 97;
                criptografado.append((char) valorASCII);
            } else {

                criptografado.append((char) valorASCII);
            }
        }

        return criptografado.toString();
    }

    public static String decodificar(String criptografado) {
        StringBuilder texto = new StringBuilder();
        for (int i = 0; i < criptografado.length(); i++) {
            int letraASCII = (int) criptografado.charAt(i) - 1;

            if (letraASCII == 96) {

                letraASCII = 32;
                texto.append((char) letraASCII);
            } else {

                texto.append((char) letraASCII);
            }
        }
        return texto.toString();
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
