package POO.HerancaEPolimorfismo.Ex7;

public class PolReg {
    int numeroLados;
    int tamanhoLado;

    public PolReg(int numeroLados, int tamanhoLado) {
        this.numeroLados = numeroLados;
        this.tamanhoLado = tamanhoLado;
    }

    public int calculaPerimetro() {
        int resultado = 0;

        resultado = tamanhoLado * numeroLados;
        return resultado;
    }

    public int calculaAngulo() {
        int resultado = 0;
        int totalAngulo = 0;

        totalAngulo= (numeroLados - 2) * 180;
        resultado = totalAngulo / numeroLados;
        return resultado;
    }

    public double calculaArea() {

        return 0;
    }
}
