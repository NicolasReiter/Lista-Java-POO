package POO.Lista2.Ex2;

public class Ponto2D  implements Cloneable{
    private double x;
    private double y;
    private double z;

    public Ponto2D() {
        setX(0);
        setY(0);
    }

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void movimentaPonto(double x, double y) {
        setX(x);
        setY(y);
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
        distanciaValor = Math.sqrt(((this.getX() - ponto.getX()) * (this.getX() - ponto.getX())) + ((this.getY() - ponto.getY()) * (this.getY() - ponto.getY())));

        return distanciaValor;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not allowed.");
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
