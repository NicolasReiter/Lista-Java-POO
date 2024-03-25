package POO.Lista2.Ex5;

import POO.Lista2.Ex2.Ponto2D;

public class Circulo {
    int raio;
    Ponto2D ponto;

    public Circulo(int raio, Ponto2D ponto) {
        this.raio = raio;
        this.ponto = ponto;
    }

    public Circulo(int raio) {
        this.raio = raio;
        ponto = new Ponto2D(0, 0);
    }

    public void inflar(int raio) {
        if (raio <= this.getRaio()) {
            throw new IllegalArgumentException("Valor de raio tem que ser maior que " + this.raio);
        } else {
            this.setRaio(raio);
        }
    }
    public void inflar() {
        raio++;
    }

    public void desinflar(int raio) {
        if (raio >= this.getRaio()) {
            throw new IllegalArgumentException("Valor de raio tem que ser menor que " + this.raio);
        } else {
            this.setRaio(raio);
        }
    }
    public void desinflar() {
        if (raio > 0) {
            raio--;
        } else {
            throw new IllegalStateException("Raio não pode ser negativo!!");
        }
    }

    public void mover() {
        ponto.movimentaPonto(0, 0);
    }

    public void mover(double x, double y) {
        ponto.movimentaPonto(x , y);
    }

    public void mover(Ponto2D ponto) {
        this.setPonto(ponto);
    }

    public double area() {
        double area = 3.14 * (Math.pow(this.raio, 2));
        return area;
    }

    public int getRaio() {
        return raio;
    }
    public void setRaio(int raio) {
        this.raio = raio;
    }
    public Ponto2D getPonto() {
        return ponto;
    }
    public void setPonto(Ponto2D ponto) {
        this.ponto = ponto;
    }
}
