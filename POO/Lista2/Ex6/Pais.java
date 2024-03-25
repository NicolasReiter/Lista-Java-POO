package POO.Lista2.Ex6;

public class Pais {
    int codigoISO;
    String nome;
    int populacao;
    double dimensao;

    public Pais(int codigoISO, String nome, double dimensao) {
        this.codigoISO = codigoISO;
        this.nome = nome;
        this.dimensao = dimensao;
    }

    public boolean verificarIgualdade(Pais pais) {
        if (this.getCodigoISO() == pais.getCodigoISO()) {
            return true;
        }
        return false;
    }

    public int getCodigoISO() {
        return codigoISO;
    }
    public void setCodigoISO(int codigoISO) {
        this.codigoISO = codigoISO;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getPopulacao() {
        return populacao;
    }
    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }
    public double getDimensao() {
        return dimensao;
    }
    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }
}
