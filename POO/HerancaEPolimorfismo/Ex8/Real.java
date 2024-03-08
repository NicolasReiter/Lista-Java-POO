package POO.HerancaEPolimorfismo.Ex8;

public class Real extends Complexo{
    public Real(float real) {
        super(real, 0);
    }

    public int Sinal() {
        if (real >= 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
