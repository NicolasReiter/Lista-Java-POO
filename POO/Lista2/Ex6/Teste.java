package POO.Lista2.Ex6;

public class Teste {
    public static void main(String[] args) {
        Pais brasil = new Pais("BRA", "Brasil", 200000000, 8500700);
        Pais argentina = new Pais("ARG", "Argentina", 45000000, 2780000);
        Pais uruguai = new Pais("URU", "Uruguai", 3000000, 176000);
        Pais suriname = new Pais("SUR", "Suriname", 600000, 160800);
        Pais chile = new Pais("CHL", "Chile", 19000000, 756600);
        Pais paraguai = new Pais("PRG" , "Paraguai", 6000000, 406000);

        System.out.println("============Igualdade============");
        System.out.println(brasil.verificarIgualdade(chile));
        System.out.println("============Densidade============");
        System.out.println(brasil.calcularDensidade());
        System.out.println(argentina.calcularDensidade());
        System.out.println(suriname.calcularDensidade());
        System.out.println(chile.calcularDensidade());
        System.out.println("============Limitrofe============");
        brasil.add(argentina);
        brasil.add(uruguai);
        brasil.add(suriname);
        brasil.add(paraguai);
        System.out.println(brasil.verificarLimitrofe(suriname));
        System.out.println("============Vizinhos============");
        argentina.add(brasil);
        argentina.add(chile);
        argentina.add(uruguai);
        argentina.add(paraguai);
        brasil.verificarVizinhos(argentina);
    }
}
