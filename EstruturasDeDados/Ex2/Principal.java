package EstruturasDeDados.Ex2;

public class Principal {
    public static void main(String[] args) {
        ListOperation<String> lista = new ListOperation<>();

        lista.addOrdem("Pedro");
        lista.addOrdem("João");
        lista.addOrdem("Carlos");
        lista.addOrdem("Ana");
        lista.addOrdem("Diego");

        lista.string();

        lista.add("Vinícius", 3);

        lista.string();
    }
}
