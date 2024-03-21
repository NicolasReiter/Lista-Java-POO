package POO.Lista2.Ex3;

public class NumeroComplexo {
    private int numeroInteiro;
    private int numeroImaginario;

    public NumeroComplexo(int numeroInteiro, int numeroImaginario) {
        this.numeroInteiro = numeroInteiro;
        this.numeroImaginario = numeroImaginario;
    }

    public void somar(NumeroComplexo numero) {
        int resultadoInteiro = 0;
        int resultadoImaginario = 0;
        resultadoInteiro = (this.getNumeroInteiro() + numero.getNumeroInteiro());
        resultadoImaginario = (this.getNumeroImaginario() + numero.getNumeroImaginario());
        System.out.println(string(resultadoInteiro, resultadoImaginario));
    }

    public void subtrair(NumeroComplexo numero) {
        int resultadoInteiro = 0;
        int resultadoImaginario = 0;
        resultadoInteiro = (this.getNumeroInteiro() - numero.getNumeroInteiro());
        resultadoImaginario = (this.getNumeroImaginario() - numero.getNumeroImaginario());
        System.out.println(string(resultadoInteiro, resultadoImaginario));
    }

    public void multiplicar(NumeroComplexo numero) {
        int resultadoInteiro = 0;
        int resultadoImaginario = 0;
        resultadoInteiro = ((this.getNumeroInteiro() * numero.getNumeroInteiro()) - (this.getNumeroImaginario() * numero.getNumeroImaginario()));
        resultadoImaginario = ((this.getNumeroInteiro() * numero.getNumeroImaginario()) + (this.getNumeroImaginario() * numero.getNumeroInteiro()));
        System.out.println(string(resultadoInteiro, resultadoImaginario));
    }

    public void dividir(NumeroComplexo numero) {
        int resultadoInteiro = 0;
        int resultadoImaginario = 0;
        resultadoInteiro = (((this.getNumeroInteiro() * numero.getNumeroInteiro()) + (this.getNumeroImaginario() * numero.getNumeroImaginario())) /
                ((numero.getNumeroInteiro() * numero.getNumeroInteiro()) + (numero.getNumeroImaginario() * numero.getNumeroImaginario())));
        resultadoImaginario = (((this.getNumeroImaginario() * numero.getNumeroInteiro()) - (this.getNumeroInteiro() * numero.getNumeroImaginario())) /
                ((numero.getNumeroInteiro() * numero.getNumeroInteiro()) + (numero.getNumeroImaginario() * numero.getNumeroImaginario())));
        System.out.println(string(resultadoInteiro, resultadoImaginario));
    }

    public void modulo() {
        double resultado = 0;

        resultado = Math.sqrt((this.getNumeroInteiro() * this.getNumeroInteiro()) + (this.getNumeroImaginario() * this.getNumeroImaginario()));
        System.out.println(resultado);
    }

    public boolean comparacao(NumeroComplexo numero) {
        if (this.getNumeroInteiro() == numero.getNumeroInteiro() && this.getNumeroImaginario() == numero.getNumeroImaginario()) {
            return true;
        }
        return false;
    }

    public String string(int resultadoInteiro, int resultadoImaginario) {
        if (resultadoImaginario > 0) {
            return resultadoInteiro + " + " + resultadoImaginario + "i";
        }
        return resultadoInteiro + " - " + Math.abs(resultadoImaginario) + "i";
    }

    public int getNumeroInteiro() {
        return numeroInteiro;
    }
    public void setNumeroInteiro(int numeroInteiro) {
        this.numeroInteiro = numeroInteiro;
    }
    public int getNumeroImaginario() {
        return numeroImaginario;
    }
    public void setNumeroImaginario(int numeroImaginario) {
        this.numeroImaginario = numeroImaginario;
    }
}
