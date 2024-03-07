package POO.HerancaEPolimorfismo;

public class TrianguloEq extends PolReg{


    public TrianguloEq(int numeroLados, int tamanhoLado) {
        super(numeroLados, tamanhoLado);
    }

    public double calculaArea() {
        double resultado = 0;

        resultado = ((tamanhoLado * tamanhoLado) * 1.7) / 4;
        return resultado;
    }
}

