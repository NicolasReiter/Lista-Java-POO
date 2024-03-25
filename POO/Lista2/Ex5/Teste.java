package POO.Lista2.Ex5;

import POO.Lista2.Ex2.Ponto2D;

public class Teste {
    public static void main(String[] args) {
        Ponto2D ponto2D = new Ponto2D(2,11);

        Circulo circulo = new Circulo(10);
        Circulo circulo2 = new Circulo(4, ponto2D);
        System.out.println("(" + circulo.getPonto() + ")");
        System.out.println("(" + circulo2.getPonto() + ")");
        System.out.println(circulo.area());
        System.out.println(circulo2.area());

        System.out.println("========================");

        circulo.inflar(13);
        circulo2.inflar();
        System.out.println(circulo.area());
        System.out.println(circulo2.area());

        System.out.println("========================");

        circulo.desinflar();
        circulo2.desinflar(1);
        System.out.println(circulo.area());
        System.out.println(circulo2.area());

        System.out.println("========================");

        circulo.mover(4, 7);
        circulo2.mover();
        System.out.println("(" + circulo.getPonto() + ")");
        System.out.println("(" + circulo2.getPonto() + ")\n");

        Ponto2D ponto = new Ponto2D(7, 2);
        circulo2.mover(ponto);
        System.out.println("(" + circulo2.getPonto() + ")");
    }
}
