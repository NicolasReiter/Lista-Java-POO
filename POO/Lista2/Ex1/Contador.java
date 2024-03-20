package POO.Lista2;

public class Contador {
    private int itens;
    private int eventos;

    public void zerarItens() {
        itens = 0;
    }

    public void zerarEventos() {
        eventos = 0;
    }

    public void incrementarItens() {
        itens++;
    }

    public void incrementarEventos() {
        eventos++;
    }

    public int valorItens() {
        return itens;
    }
    public int valorEventos() {
        return eventos;
    }
}
