package POO.Lista2.Ex6;

import java.util.ArrayList;

public class Pais extends ArrayList {
    String codigoISO;
    String nome;
    int populacao;
    double dimensao;

    public Pais(String codigoISO, String nome, int populacao, double dimensao) {
        this.codigoISO = codigoISO;
        this.nome = nome;
        this.populacao = populacao;
        this.dimensao = dimensao;
    }

    public boolean verificarIgualdade(Pais pais) {
        return this.getCodigoISO().equals(pais.getCodigoISO());
    }

    public double calcularDensidade() {
        return this.getPopulacao() / this.getDimensao();
    }

    public boolean verificarLimitrofe(Pais pais) {
        return this.contains(pais);
    }

    public void verificarVizinhos(Pais pais) {
        System.out.print("Países Vizinhos -> ");
        for (int i = 0; i < this.size(); i++) {
            Pais paisVizinho = (Pais) this.get(i);
            for (int j = 0; j < pais.size(); j++) {
                if (this.get(i) == pais.get(j)) {
                    System.out.print(paisVizinho.getNome() + " ");
                }
            }
        }
    }

    public String getCodigoISO() {
        return codigoISO;
    }
    public void setCodigoISO(String codigoISO) {
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
