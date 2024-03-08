package POO.HerancaEPolimorfismo.Ex8;

import java.util.Scanner;

public class Controle {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu número real: ");
        float real = teclado.nextFloat();
        System.out.println("Digite seu número imaginário: ");
        float imaginario = teclado.nextFloat();

        Complexo complexo = new Complexo(real, imaginario);

        System.out.println("Módulo do seu número complexo: " + complexo.Modulo());
        System.out.println("Ângulo do seu número complexo: " + complexo.Angulo());

        Real reais = new Real(real);
        if (reais.Sinal() == 1) {
            System.out.println("O número é positivo!!");
        } else {
            System.out.println("O n´mero é nagativo!!");
        }
    }
}
