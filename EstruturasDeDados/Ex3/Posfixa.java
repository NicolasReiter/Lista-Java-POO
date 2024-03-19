package EstruturasDeDados.Ex3;

public class Posfixa {

    public static void main(String[] args) {
        String operacao = "( 1 + 5 ) * 2 + 13";
        System.out.println(conversao(operacao));
        //System.out.println(calcula(conversao(operacao)));
    }
    public static Pilha<String> conversao(String infixa) {
        String vetor[] = infixa.split(" ");
        Pilha<String> pilha = new Pilha(infixa.length());
        Pilha<String> posfixa = new Pilha<>(infixa.length());
        int cont = 0;
        String c;

        while(cont < vetor.length) {
            c = vetor[cont];
            switch(c) {
                case "*":
                case "/":
                case "+":
                case "-":
                    while((!pilha.estaVazia()) && prioridade(c) <= prioridade(pilha.peek())) {
                        posfixa.push(pilha.pop());
                    }
                    pilha.push(c);
                    break;
                case "(":
                        pilha.push(c);
                    break;
                case ")":
                    while((pilha.peek()) != "(") {
                        posfixa.push(pilha.pop());
                    }
                    if(pilha.peek() == "(") {
                        pilha.pop();
                    }
                    break;
                default:
                    posfixa.push(c);
                    break;
            }
            cont++;
        }
        while(pilha.tamanhoPilha() > 0) {
            if (pilha.peek() != "(")
                posfixa.push(pilha.pop());
            else
                pilha.pop();
        }
        return posfixa;
    }

    public static int prioridade(String elemento) {
        int prioridade;
        switch(elemento) {
            case "+":
            case "-":
                prioridade = 1;
                break;
            case "*":
            case "/":
                prioridade = 2;
                break;
            default:
                prioridade = 0;
                break;
        }
        return prioridade;
    }

    public static String calcula(String posfixa) {
        String vetor[] = posfixa.split(" ");
        Pilha p = new Pilha(vetor.length);
        int arg1, arg2;
        for (int i=0; i < vetor.length; i++) {
            if (true) {
                p.push(vetor[i]);
            } else if(vetor[i] == "+") {
                arg1 = (int) p.peek(); p.pop();
                arg2 = (int) p.peek(); p.pop();
                p.push(arg1+arg2);
            } else if(vetor[i] == "*") {
                arg1 = (int) p.peek(); p.pop();
                arg2 = (int) p.peek(); p.pop();
                p.push(arg1*arg2);
            } else if(vetor[i] == "-") {
                arg1 = (int) p.peek(); p.pop();
                arg2 = (int) p.peek(); p.pop();
                p.push(arg1-arg2);
            } else if(vetor[i] == "/") {
                arg1 = (int) p.peek(); p.pop();
                arg2 = (int) p.peek(); p.pop();
                p.push(arg1/arg2);
            }
        }
        return (String) p.peek();
    }
}