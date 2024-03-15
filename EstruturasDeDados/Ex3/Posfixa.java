package EstruturasDeDados.Ex3;

import java.util.Stack;

public class Posfixa {

    public static void main(String[] args) {
        String operacao = "(1 + 5) * 2 + 13";
        System.out.println(conversao(operacao));
    }
    public static String conversao(String infixa) {
        String posfixa = "";
        Pilha<Integer> pilha = new Pilha<Integer>(infixa.length());
        int cont = 0;
        char c;

        while(cont < infixa.length()) {
            c = infixa.charAt(cont);
            switch(c) {
                case '*':
                case '/':
                case '+':
                case '-':
                case '^':
                    while((!pilha.estaVazia()) && prioridade(c) <= prioridade((char)((int) pilha.peek()))) {
                        posfixa += (char) ((int) pilha.pop());
                    }
                        pilha.push((int) c);
                    break;
                case '(':
                        pilha.push((int) c);
                    break;
                case ')':
                    while((char)((int)pilha.peek()) != '(') {
                        posfixa += (char) ((int) pilha.pop());
                    }
                    if((char)((int)pilha.peek()) == '(') {
                        pilha.pop();
                    }
                    break;
                default:
                    posfixa += infixa.charAt(cont);
                    break;
            }
            cont++;
        }
        while(pilha.tamanhoPilha() > 0) {
            if ((char) ((int) pilha.peek()) != '(')
                posfixa += (char) ((int) pilha.pop());
            else
                pilha.pop();
        }
        return posfixa;
    }

    public static int prioridade(char elemento) {
        int prioridade;
        switch(elemento)
        {
            case '+':
            case '-':
                prioridade = 1;
                break;
            case '*':
            case '/':
                prioridade = 2;
                break;
            default:
                prioridade = 0;
                break;
        }
        return prioridade;
    }

    public static int calcula(String posfixa) {
        String vetor[] = posfixa.split(" ");
        for (int i = 0; i < vetor.length; i++) {
            int validação
            if (vetor[i] != "*" || vetor[i] != "/" || vetor[i] != "+" ||vetor[i] != "-") {

            }
            if ((vetor[i] == "*" || vetor[i] == "/") && (vetor[i - 1] == ((int)vetor[i - 1]) && vetor[i - 2]))  {

            }
        }

    }
}
