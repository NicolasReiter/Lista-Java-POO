package POO.Lista2.Ex4;

public class Teste {
    public static void main(String[] args) {
        Reta pontoTeste = new Reta(2, 1);
        Reta pontoTeste2 = new Reta(4, 7);

        System.out.println(pontoTeste.linear(pontoTeste2));

        Reta possui = new Reta(1, -2);

        System.out.println(pontoTeste.possuiPonto(pontoTeste2, possui));

        Reta pontoA = new Reta(-6, 1);
        Reta pontoB = new Reta(4,-5);
        Reta pontoC = new Reta(-3, -3);
        Reta pontoD = new Reta(7, 2);
        Reta intersecao = new Reta(-1,-2);
        System.out.println(pontoC.possuiPonto(pontoD,intersecao));
        System.out.println(pontoA.possuiPonto(pontoB,intersecao));
        pontoA.interseccao(pontoB, pontoC, pontoD, intersecao);

        System.out.println(pontoA.representacao(pontoB));
    }
}
