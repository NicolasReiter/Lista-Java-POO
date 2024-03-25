package POO.Lista2.Ex2;

public class Ponto2D  implements Cloneable{
    private double x;
    private double y;

    public Ponto2D() {
        this.setX(0);
        this.setY(0);
    }

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ponto2D(Ponto2D ponto) {
       this.setX(ponto.getX());
       this.setY(ponto.getY());
    }

    public void movimentaPonto(double x, double y) {
        this.setX(x);
        this.setY(y);
    }

    public boolean comparacao(Ponto2D ponto) {
        if (this.getX() == ponto.getX() && this.getY() == ponto.getY()) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "X: " + this.getX()  + ", Y: " + this.getY();
    }

    public double distancia(Ponto2D ponto) {
        double distanciaValor = 0;
        distanciaValor = Math.sqrt(((ponto.getX() - this.getX()) * (ponto.getX() - this.getX())) + ((ponto.getY() - this.getY()) * (ponto.getY() - this.getY())));

        return distanciaValor;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone não autorizado");
            return this;
        }
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
}
