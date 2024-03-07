package POO.HerancaEPolimorfismo.Ex8;

public class Complexo {

    float real;
    float imaginario;

    public Complexo(float real, float imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public void Modulo() {
        double resultado = 0;

        resultado = Math.sqrt((real * real) + (imaginario * imaginario));

    }

    public void Angulo() {

    }
}
