package POO.Calculadora;

public class CalcDados {

    double numero1;
    double numero2;
    char operador;

    public double getOperando1() {
        return numero1;
    }

    public void setOperando1(double numero1) {
        this.numero1 = numero1;
    }

    public double getOperando2() {
        return numero2;
    }

    public void setOperando2(double numero2) {
        this.numero2 = numero2;
    }

    public void setOperacao(char operador) {
        this.operador = operador;
    }

    public char getOperacao() {
        return operador;
    }
}
