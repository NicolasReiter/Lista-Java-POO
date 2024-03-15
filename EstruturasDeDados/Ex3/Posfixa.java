package EstruturasDeDados.Ex3;

public class Posfixa {

    public static void main(String[] args) {
        String operacao = "(1 + 5) * 2 + 13";
        System.out.println(conversao(operacao));
        System.out.println(calcula());
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
        Pilha p = new Pilha(posfixa.length());
        int arg1, arg2;
        char c;
        for (int i=0; i < p.tamanhoPilha(); i++) {
            c = posfixa.charAt(i);
            if (Character.isDigit(c))
                p.push(Character.digit(c,10));
            else if(c=='+') {
                arg1 = (int) p.peek(); p.pop();
                arg2 = (int) p.peek(); p.pop();
                p.push(arg1+arg2);
            }
            else if(c=='*') {
                arg1 = (int) p.peek(); p.pop();
                arg2 = (int) p.peek(); p.pop();
                p.push(arg1*arg2);
            }
            else if(c=='-') {
                arg1 = (int) p.peek(); p.pop();
                arg2 = (int) p.peek(); p.pop();
                p.push(arg1-arg2);
            }
            else if(c=='/') {
                arg1 = (int) p.peek(); p.pop();
                arg2 = (int) p.peek(); p.pop();
                p.push(arg1/arg2);
            }
        }
        return (int) p.peek();
    }
}
