package EstruturasDeDados.Ex3;

public class Pilha<T> {
    private T[] info;
    private int limite;
    private int tamanho;

    public Pilha(int limite) {
        info = (T[]) new Object[limite];
        this.limite = limite;
        this.tamanho = 0;
    }

    public void push(T valor) {
        if(limite == tamanho) {
            throw new RuntimeException("Capacidade esgotada da pilha");
        }
        info[tamanho] = valor;
        tamanho = tamanho + 1;
    }

    public T pop() {
        T valor;
        valor = peek();
        tamanho = tamanho - 1;
        return valor;
    }

    public T peek() {
        if(estaVazia()) {
            throw new RuntimeException("Pilha está vazia");
        }
        return info[tamanho - 1];
    }

    public boolean estaVazia() {
        return (tamanho == 0);
    }

    public int tamanhoPilha() {
        return tamanho;
    }
}
