package Excecoes;

public class MenorQueException extends Throwable {

    public String getMessage() {
        return "Palpite MENOR que número sorteado";
    }
}
