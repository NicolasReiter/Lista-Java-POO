package POO.Lista2.Ex9;

import java.util.ArrayList;

public class Conjunto extends ArrayList{
    String elemento;
    public Conjunto() {
    }

    public void adiciona(String elemento) {
        if (this.isEmpty()) {
            this.add(elemento);
        } else if(!this.contains(elemento)) {
            this.add(elemento);
        }
    }

    public void pertence(String elemento) {
        if (this.contains(elemento)) {
            System.out.println("Conjunto contém o elemento " + elemento);
        } else {
            System.out.println("O " + elemento + " não está contido no conjunto!!");
        }
    }

    public void uniao(Conjunto outraLista) {
        for (int i = 0; i < outraLista.size(); i++) {
            this.adiciona((String) outraLista.get(i));
        }
    }

    public ArrayList interseccao(Conjunto outraLista) {
        ArrayList novaLista = new ArrayList();
        for (int i = 0; i < outraLista.size(); i++) {
            if (this.contains(outraLista.get(i))) {
                novaLista.add(outraLista.get(i));
            }
        }
        return novaLista;
    }

    public ArrayList menos(Conjunto outraLista) {
        ArrayList novaLista = new ArrayList();
        for (int i = 0; i < outraLista.size(); i++) {
            if (!outraLista.contains(this.get(i))) {
                novaLista.add(this.get(i));
            }
        }
        return novaLista;
    }
}
