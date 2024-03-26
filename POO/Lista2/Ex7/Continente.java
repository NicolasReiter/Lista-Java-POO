package POO.Lista2.Ex7;

import POO.Lista2.Ex6.Pais;
import java.util.ArrayList;

public class Continente extends ArrayList {
    String nome;
    Pais pais;
    public Continente(String nome) {
        this.nome = nome;
    }

    public void addPais(Pais pais) {
        this.add(pais);
    }

    public double calcularDimensaoTotal() {
        double total = 0;
        for (int i = 0; i < this.size(); i++) {
            Pais pais = (Pais) this.get(i);
            total += pais.getDimensao();
        }
        return total;
    }

    public double calcularPopulacaoTotal() {
        double total = 0;
        for (int i = 0; i < this.size(); i++) {
            Pais pais = (Pais) this.get(i);
            total += pais.getPopulacao();
        }
        return total;
    }

    public double calcularDensidadeTotal() {
        double total = 0;
        for (int i = 0; i < this.size(); i++) {
            Pais pais = (Pais) this.get(i);
            total += pais.calcularDensidade();
        }
        return total;
    }

    public Pais maiorPopulcao() {
        int maisPopuloso = 0;
        Pais paisMaisPopuloso = null;
        for (int i = 0; i < this.size(); i++) {
            Pais pais = (Pais) this.get(i);
            if (pais.getPopulacao() > maisPopuloso) {
                maisPopuloso = pais.getPopulacao();
                paisMaisPopuloso = pais;
            }
        }
        return paisMaisPopuloso;
    }

    public Pais menorPopulcao() {
        int menosPopuloso = 2000000000;
        Pais paisMenosPopuloso = null;
        for (int i = 0; i < this.size(); i++) {
            Pais pais = (Pais) this.get(i);
            if (pais.getPopulacao() < menosPopuloso) {
                menosPopuloso = pais.getPopulacao();
                paisMenosPopuloso = pais;
            }
        }
        return paisMenosPopuloso;
    }

    public Pais maiorDimensao() {
        int maisDimenso = 0;
        Pais paisMaisDimenso= null;
        for (int i = 0; i < this.size(); i++) {
            Pais pais = (Pais) this.get(i);
            if (pais.getDimensao() > maisDimenso) {
                maisDimenso = pais.getPopulacao();
                paisMaisDimenso = pais;
            }
        }
        return paisMaisDimenso;
    }

    public Pais menorDimensao() {
        int menosDimenso = 2000000000;
        Pais paisMenosDimenso = null;
        for (int i = 0; i < this.size(); i++) {
            Pais pais = (Pais) this.get(i);
            if (pais.getDimensao() < menosDimenso) {
                menosDimenso = pais.getPopulacao();
                paisMenosDimenso = pais;
            }
        }
        return paisMenosDimenso;
    }

    public double calcularRazaoTerritorial() {
        return maiorPopulcao().getDimensao() / menorPopulcao().getDimensao();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
