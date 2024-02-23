package Array;

public class Ex9Array {

    int[] array;
    int numeroAtual;
    int tamanhoMaximo;
    int posicaoAtual;

    public Ex9Array(int tamanhoMaximo) {

        this.array = new int[tamanhoMaximo];

        this.tamanhoMaximo = tamanhoMaximo;
        this.posicaoAtual = array.length - 1;
        this.numeroAtual = 0;
    }

    public boolean adicionar(int n) {
        if(posicaoAtual > tamanhoMaximo) {
            return false;
        } else {
            numeroAtual = n;
            array[posicaoAtual] = numeroAtual;
            posicaoAtual--;

            return true;
        }
    }

    public int calculaMedia() {
        int valorTotal = 0;

        for (int i = 0; i < array.length; i++) {

            valorTotal += array[i];
        }

        int media = valorTotal / array.length;
        return media;
    }
}
