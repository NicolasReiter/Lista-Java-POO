package Excecoes;

public class MaiorQueException extends Throwable {

    public String getMessage() {
        return "Palpite MAIOR que número sorteado";
    }
}
