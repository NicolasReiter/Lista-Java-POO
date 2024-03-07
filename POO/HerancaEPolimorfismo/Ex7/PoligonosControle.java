package POO.HerancaEPolimorfismo.Ex7;

import java.util.Scanner;

public class PoligonosControle {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual polígono você deseja crias?");
        String poligono = teclado.next().toLowerCase();

        switch (poligono) {
            case "regular":
                System.out.println("Quantos lados tem seu polígono regular?");
                int numLados = teclado.nextInt();
                System.out.println("Qual o tamanho dos lados?");
                int ladosRegular = teclado.nextInt();
                PolReg regular = new PolReg(numLados, ladosRegular);

                System.out.println("Tamanho do seu perimetro: " + regular.calculaPerimetro());
                System.out.println("Valor do ângulo interno: " + regular.calculaAngulo());
                break;
            case "triangulo":
                System.out.println("Qual o tamanho dos lados?");
                int ladosTriangulo = teclado.nextInt();
                TrianguloEq triangulo = new TrianguloEq(3, ladosTriangulo);

                System.out.println("Tamanho do seu perimetro: " + triangulo.calculaPerimetro());
                System.out.println("Valor do ângulo interno: " + triangulo.calculaAngulo());
                System.out.println("Valor da area: " + triangulo.calculaArea());
                break;
            case "quadrado":
                System.out.println("Qual o tamanho dos lados?");
                int ladosQuadrado = teclado.nextInt();
                Quadrado quadrado = new Quadrado(4, ladosQuadrado);

                System.out.println("Tamanho do seu perimetro: " + quadrado.calculaPerimetro());
                System.out.println("Valor do ângulo interno: " + quadrado.calculaAngulo());
                System.out.println("Valor da area: " + quadrado.calculaArea());
                break;
        }
    }
}
