package POO.Lista2.Ex4;

public class Reta {

    private int pontoX;
    private int pontoY;

    public Reta(int pontoX, int pontoY) {
        this.pontoX = pontoX;
        this.pontoY = pontoY;
    }

    public double angular(Reta reta2) {
        double angular = 0;
        angular = ((reta2.getPontoY() - reta2.getPontoX()) / (this.getPontoY()) - this.getPontoX());
        return angular;
    }

    public double linear(Reta reta) {
        double linear = 0;
        linear = this.getPontoX() * this.angular(reta);
        return linear;
    }

    public int getPontoX() {
        return pontoX;
    }
    public void setPontoX(int pontoX) {
        this.pontoX = pontoX;
    }
    public int getPontoY() {
        return pontoY;
    }
    public void setPontoY(int pontoY) {
        this.pontoY = pontoY;
    }
}
