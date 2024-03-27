package POO.Lista2.Ex9;

public class Teste {
    public static void main(String[] args) {
        Conjunto conjunto1 = new Conjunto();
        Conjunto conjunto2 = new Conjunto();

        conjunto1.adiciona("A");
        conjunto1.adiciona("B");
        conjunto1.adiciona("C");
        conjunto1.adiciona("D");
        conjunto1.adiciona("E");
        conjunto1.adiciona("F");
        conjunto1.adiciona("G");
        conjunto1.adiciona("H");

        conjunto2.adiciona("A");
        conjunto2.adiciona("E");
        conjunto2.adiciona("I");
        conjunto2.adiciona("J");
        conjunto2.adiciona("K");
        conjunto2.adiciona("L");
        conjunto2.adiciona("M");
        conjunto2.adiciona("N");

        conjunto1.pertence("B");

        System.out.println(conjunto1.interseccao(conjunto2));
        System.out.println(conjunto1.menos(conjunto2));

        conjunto1.uniao(conjunto2);
        conjunto1.pertence("N");
    }
}
