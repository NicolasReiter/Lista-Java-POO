package POO.HerancaEPolimorfismo.Ex8;

public class Complexo {
    float real;
    float imaginario;

    public Complexo(float real, float imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public float Modulo() {
        double resultado = 0;

        resultado = Math.sqrt((real * real) + (imaginario * imaginario));
        return (float) resultado;
    }

    public float Angulo() {
        double anguloRadianos = Math.atan2(imaginario, real);
        double anguloGraus = Math.toDegrees(anguloRadianos);

        return (float) anguloGraus;
    }
}
