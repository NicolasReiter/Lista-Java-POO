package POO.HerancaEPolimorfismo;

public class Quadrado extends PolReg{
    public Quadrado(int numeroLados, int tamanhoLado) {
        super(numeroLados, tamanhoLado);
    }

    public double calculaArea() {
        double resultado = 0;

        resultado = (tamanhoLado * tamanhoLado);

        return resultado;
    }
}
