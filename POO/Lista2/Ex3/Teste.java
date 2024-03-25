package POO.Lista2.Ex3;

public class Teste {
    public static void main(String[] args) {
        NumeroComplexo complexoSoma =  new NumeroComplexo(6, 5);
        NumeroComplexo complexoSoma2 =  new NumeroComplexo(2, -1);

        complexoSoma.somar(complexoSoma2);

        NumeroComplexo complexoSubtrair = new NumeroComplexo(4, 5);
        NumeroComplexo complexoSubtrair2 = new NumeroComplexo(-1, 3);

        complexoSubtrair.subtrair(complexoSubtrair2);

        NumeroComplexo complexoMultiplica = new NumeroComplexo(5, 1);
        NumeroComplexo complexoMultiplica2 = new NumeroComplexo(2, -1);

        complexoMultiplica.multiplicar(complexoMultiplica2);

        NumeroComplexo complexoDivide = new NumeroComplexo(1, 5);
        NumeroComplexo complexoDivide2 = new NumeroComplexo(3, 2);

        complexoDivide.dividir(complexoDivide2);

        NumeroComplexo complexoModulo = new NumeroComplexo(1,3);

        complexoModulo.modulo();

        NumeroComplexo complexoCompara = new NumeroComplexo(2, 2);
        NumeroComplexo complexoCompara2 = new NumeroComplexo(2, 2);

        System.out.println(complexoCompara.comparacao(complexoCompara2));
    }
}
