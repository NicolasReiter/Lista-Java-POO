package POO.Relacionamentos.Ex6;

import java.util.Scanner;

public class CalcControle {
    CalcDados dados = new CalcDados();

    public void executar() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        dados.setOperando1(teclado.nextDouble());


        while (dados.getOperacao() != 's') {
            System.out.println("Qual operador desejas usar?");
            dados.setOperacao(teclado.next().charAt(0));
            System.out.println("Digite o segundo número: ");
            dados.setOperando2(teclado.nextDouble());

            double resultado = opera(dados.getOperando1(), dados.getOperando2(), dados.getOperacao());
            dados.setOperando1(resultado);
            System.out.println("====RESULTADO====");
            System.out.println(dados.getOperando1());
            System.out.println("=================");
        }
    }

    private double opera(double operando1, double operando2, char operador) {
        double resultado = 0;

        switch (operador) {
            case '+':
                resultado += (operando1 + operando2);
                break;
            case '-':
                resultado += (operando1 - operando2);
                break;
            case '*':
                resultado += (operando1 * operando2);
                break;
            case '/':
                resultado += (operando1 / operando2);
                break;
            case 's':
                System.exit(0);
        }
        return resultado;
    }
}
