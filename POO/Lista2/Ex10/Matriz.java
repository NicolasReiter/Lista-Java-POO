package POO.Lista2.Ex10;

import java.util.ArrayList;

public class Matriz implements Cloneable{
    int colunas;
    int linhas;
    int elemento;
    int[][] matriz;

    public Matriz(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.matriz = new int[linhas][colunas];
    }

    public boolean comparacao(ArrayList outraMatriz) {
        return this.equals(outraMatriz);
    }

    public Matriz transposta() {
        Matriz matrizTransposta = new Matriz(this.getColunas(), this.getLinhas());
        for (int i = 0; i < this.getLinhas(); i++) {
            for (int j = 0; j < this.getColunas(); j++) {
                matrizTransposta.setElemento(j, i, this.matriz[i][j]);
            }
        }
        return matrizTransposta;
    }

    public Matriz oposta() {
        Matriz matrizOposta = new Matriz(this.getLinhas(), this.getColunas());
        for (int i = 0; i < this.getLinhas(); i++) {
            for (int j = 0; j < this.getColunas(); j++) {
                matrizOposta.setElemento(i, j, (this.matriz[i][j] * -1));
            }
        }
        return matrizOposta;
    }

    public Matriz nula() {
        for (int i = 0; i < this.getLinhas(); i++) {
            for (int j = 0; j < this.getColunas(); j++) {
                this.setElemento(i, j, 0);
            }
        }
        return this;
    }

    public boolean identidade() {
        if (this.getLinhas() == this.getColunas()) {
            for (int i = 0; i < this.getLinhas(); i++) {
                for (int j = 0; j < this.getColunas(); j++) {
                    if (matriz[i][i] != 1 || (i != j && matriz[i][j] != 0)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public boolean diagonal() {
        if (this.getLinhas() == this.getColunas()) {
            for (int i = 0; i < this.getLinhas(); i++) {
                for (int j = 0; j < this.getColunas(); j++) {
                    if (i != j && matriz[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean singular() {
        if (this.getLinhas() == this.getColunas()) {
            for (int i = 0; i < this.getLinhas(); i++) {
                if (matriz[0][0] != matriz[i][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean simetrica() {
        Matriz matrizTransposta = transposta();
        if (this.getLinhas() == this.getColunas()) {
            for (int i = 0; i < this.getLinhas(); i++) {
                for (int j = 0; j < this.getColunas(); j++) {
                    if (matrizTransposta.matriz[i][j] != matriz[i][j]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean antisimetrica() {
        Matriz matrizOposta = oposta();
        if (this.getLinhas() == this.getColunas()) {
            for (int i = 0; i < this.getLinhas(); i++) {
                for (int j = 0; j < this.getColunas(); j++) {
                    if (matrizOposta.matriz[i][j] != matriz[i][j]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public Matriz somar(Matriz matrizSoma) {
        if (this.getLinhas() == matrizSoma.getLinhas() && this.getColunas() == matrizSoma.getColunas()) {
            for (int i = 0; i < this.getLinhas(); i++) {
                for (int j = 0; j < this.getColunas(); j++) {
                    this.setElemento(i, j, matrizSoma.matriz[i][j] + this.matriz[i][j]);
                }
            }
        }
        return this;
    }

    public Matriz subtrair(Matriz matrizSubtrai) {
        if (this.getLinhas() == matrizSubtrai.getLinhas() && this.getColunas() == matrizSubtrai.getColunas()) {
            for (int i = 0; i < this.getLinhas(); i++) {
                for (int j = 0; j < this.getColunas(); j++) {
                    this.setElemento(i, j, matrizSubtrai.matriz[i][j] - this.matriz[i][j]);
                }
            }
        }
        return this;
    }

    public Matriz multiplicar(Matriz matrizMultiplica) {
        if (this.getLinhas() == matrizMultiplica.getLinhas() && this.getColunas() == matrizMultiplica.getColunas()) {
            for (int i = 0; i < this.getLinhas(); i++) {
                for (int j = 0; j < this.getColunas(); j++) {
                    this.setElemento(i, j, matrizMultiplica.matriz[i][j] * this.matriz[i][j]);
                }
            }
        }
        return this;
    }

    public Matriz clone() throws CloneNotSupportedException {
        return (Matriz) super.clone();
    }

    public String toString() {
        StringBuilder textoMatriz = new StringBuilder();

        for (int i = 0; i < this.getLinhas(); i++) {
            textoMatriz.append("| ");
            for (int j = 0; j < this.getColunas(); j++) {
                textoMatriz.append(this.matriz[i][j] + " | ");
            }
            textoMatriz.append("\n");
        }

        return textoMatriz.toString();
    }

    public int getColunas() {
        return colunas;
    }
    public void setColunas(int colunas) {
        this.colunas = colunas;
    }
    public int getLinhas() {
        return linhas;
    }
    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }
    public int getElemento() {
        return elemento;
    }
    public void setElemento(int linhas, int colunas, int elemento) {
        if (matriz.length > linhas && matriz[linhas].length > colunas) {
            matriz[linhas][colunas] = elemento;
        }
    }
}
