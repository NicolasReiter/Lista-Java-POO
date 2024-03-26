package POO.Lista2.Ex7;

import POO.Lista2.Ex6.Pais;

public class Teste {
    public static void main(String[] args) {
        Pais brasil = new Pais("BRA", "Brasil", 200000000, 8500700);
        Pais argentina = new Pais("ARG", "Argentina", 45000000, 2780000);
        Pais uruguai = new Pais("URU", "Uruguai", 3000000, 176000);
        Pais suriname = new Pais("SUR", "Suriname", 600000, 160800);
        Pais chile = new Pais("CHL", "Chile", 19000000, 756600);
        Pais paraguai = new Pais("PRG" , "Paraguai", 6000000, 406000);

        brasil.add(argentina);
        brasil.add(uruguai);
        brasil.add(suriname);
        brasil.add(paraguai);

        argentina.add(brasil);
        argentina.add(chile);
        argentina.add(uruguai);
        argentina.add(paraguai);

        Continente latam = new Continente("LATAM");
        latam.addPais(brasil);
        latam.addPais(argentina);
        latam.addPais(uruguai);
        latam.addPais(suriname);
        latam.addPais(chile);
        latam.addPais(paraguai);

        System.out.println("------Dimensão Total------");
        System.out.println(latam.calcularDimensaoTotal());
        System.out.println("------População Total------");
        System.out.println(latam.calcularPopulacaoTotal());
        System.out.println("------Densidade Total------");
        System.out.println(latam.calcularDensidadeTotal());
        System.out.println("------Maior População------");
        System.out.println(latam.maiorPopulcao().getNome());
        System.out.println("------Menor População------");
        System.out.println(latam.menorPopulcao().getNome());
        System.out.println("------Maior Dimensão------");
        System.out.println(latam.maiorDimensao().getNome());
        System.out.println("------Menor População------");
        System.out.println(latam.menorDimensao().getNome());
        System.out.println("------Razão Territorial(Maior e Menor)------");
        System.out.println(latam.calcularRazaoTerritorial());
    }
}
