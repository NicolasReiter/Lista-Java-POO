package EstruturasDeDados.Ex2;

public class ListOperation<T> {
    ListNode<T> primeiro;
    ListNode<T> ultimo;

    public void add(T n, int posicao) {
        ListNode<T> anterior = this.pegar(posicao);
        ListNode<T> proximo = anterior.getProximo();
        ListNode<T> novo = new ListNode<>(n , proximo);
        anterior.setProximo(novo);

    }

    public void addOrdem(T n) {
        ListNode<T> novo = new ListNode<>(n, null);
        novo.setNome((T) n);
        if (primeiro == null) {
            primeiro = novo;
        } else {
            ultimo.setProximo(novo);
        }
        ultimo = novo;
    }

    public void remove(T n) {
        ListNode<T> before = null;
        ListNode<T> current = this.primeiro;
        while (current != null && !current.getNome().equals(n)) {
            before = current;
            current = current.getProximo();
        }
        if (current != null) {
            if (before == null) {
                this.primeiro = this.primeiro.getProximo();
            } else {
                before.setProximo(current.getProximo());
            }
            if (this.ultimo == current) {
                this.ultimo = before;
            }
        }
    }

    public ListNode<T> pegar(int pos) {
        ListNode<T> p = this.primeiro;
        int posicao = 0;
        while (p != null) {
            if (posicao == pos) {
               return p;
            }
            posicao++;
            p = p.getProximo();
        }
        return null;
    }

    public void string() {
        ListNode<T> p = primeiro;
        String str = "[";
        while (p != null) {
            str += p.getNome() + ", ";
            p = p.getProximo();
        }
        System.out.println(str + "]");
    }
}
