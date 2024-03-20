package POO.Lista2.Ex2;

public class Ponto2D  implements Cloneable{
    private double x;
    private double y;
    private double z;

    public Ponto2D() {
    }

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void movimentaPonto(double x, double y) {
        setX(x);
        setY(y);
    }

    public boolean comparacao(double x, double y) {
        if (x == y) {
            return true;
        }
        return false;
    }

    public String toString(double x, double y) {
        return "X: " + x + "\n" + "Y: " + y;
    }

    public double distancia(Ponto2D um, Ponto2D dois) {
        double distanciaValor = 0;
        distanciaValor = Math.sqrt(((um.getX() - dois.getX())*(um.getX() - dois.getX())) + ((um.getY() - dois.getY())*(um.getY() - dois.getY())));

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
