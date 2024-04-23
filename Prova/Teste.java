package Prova;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        ArrayList pares = new ArrayList();
        CalculadoraPares calculadora  = new CalculadoraPares();

        calculadora.inserir(pares);
        System.out.println(calculadora.soma(pares));
        System.out.println(calculadora.dividir(calculadora.soma(pares)));
    }
}
