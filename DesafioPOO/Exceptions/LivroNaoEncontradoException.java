package DesafioPOO.Exceptions;

public class LivroNaoEncontradoException extends Throwable {

    public String getMessage() {
        return "Livro não encontrado";
    }
}
