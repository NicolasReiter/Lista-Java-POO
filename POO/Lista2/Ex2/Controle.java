package POO.Lista2.Ex2;

public class Controle {
    public static void main(String[] args) {
        Ponto2D ponto1 = new Ponto2D();
        Ponto2D ponto2 = new Ponto2D(4, -2);
        Ponto2D ponto3 = new Ponto2D(ponto2);

        System.out.println(ponto1.toString());
        System.out.println(ponto2.toString());
        System.out.println(ponto3.toString());

        ponto1.movimentaPonto(11, 15);
        System.out.println(ponto1.toString());

        System.out.println(ponto1.comparacao(ponto2));

        System.out.println(ponto1.distancia(ponto2));

        System.out.println(ponto1.clone());
    }
}
