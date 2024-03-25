package POO.Lista2.Ex4;

public class Reta {
    private int pontoX;
    private int pontoY;

    public Reta(int pontoX, int pontoY) {
        this.pontoX = pontoX;
        this.pontoY = pontoY;
    }

    public double angular(Reta ponto) {
        double angular = 0;
        angular = ((double) (ponto.getPontoY() - this.getPontoY()) / (ponto.getPontoX() - this.getPontoX()));
        return angular;
    }

    public double linear(Reta ponto) {
        double linear = 0;
        double invertido = ((this.getPontoX() * this.angular(ponto)) * (-1));
        linear = this.getPontoY() + invertido;
        return linear;
    }

    public boolean possuiPonto(Reta ponto, Reta possui) {
        double x =  (this.angular(ponto) * possui.getPontoX() + this.linear(ponto));
        if (Math.round(x) == possui.getPontoY()) {
            return true;
        }
        return false;
    }

    public void interseccao(Reta pontoB, Reta pontoC, Reta pontoD, Reta intersec) {
        boolean ab = this.possuiPonto(pontoB, intersec);
        boolean cd = pontoC.possuiPonto(pontoD, intersec);

        if (ab == true && cd == true) {
            System.out.println("A intersecção é: X=" + intersec.getPontoX() + " Y=" + intersec.getPontoY());
        }
    }

    public String representacao(Reta ponto) {
        return "(" + this.getPontoX() + ", " + this.getPontoY() + ") (" + ponto.getPontoX() + ", " + ponto.getPontoY() + ")" ;
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
