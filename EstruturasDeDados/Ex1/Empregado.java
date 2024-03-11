package EstruturasDeDados.Ex1;

import java.util.Scanner;

public class Empregado {

    String nome;
    int cpf;
    double salario;
    Empregado empregados[] = new Empregado[5];

    Scanner teclado = new Scanner(System.in);

    public Empregado(String nome, int cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public void armazena() {
        for (int i = 0; i < 5; i++) {

            System.out.println("Qual o nome do empregado?");
            String nome = teclado.next();
            System.out.println("Qual o cpf do empregado?");
            int cpf = teclado.nextInt();
            System.out.println("Qual o salário do empregrado?");
            double salario = teclado.nextDouble();

            Empregado empregado = new Empregado(nome, cpf, salario);

            empregados[i] = empregado;
        }
    }

    public void organizaSalario() {
        for (int i = 0; i < empregados.length - 1; i++) {
            for (int j = 0; j < empregados.length - i - 1; j++) {
                if (empregados[j].getSalario() > empregados[j + 1].getSalario()) {
                    int guardar = (int) empregados[j + 1].getSalario();
                    empregados[j + 1].setSalario(empregados[j].getSalario());
                    empregados[j].setSalario(guardar);
                }
            }
        }
    }

    public void remover() {
        System.out.println("Qual cpf desejas remover?");
        int desempregado = teclado.nextInt();

        Empregado copia[] = new Empregado[empregados.length - 1];
        for (int i = 0; i < empregados.length; i++) {
            if (desempregado != empregados[i].getCpf()) {
                copia[i] = empregados[i];
            }
        }

        for (int i = 0; i < copia.length; i++) {
            System.out.println(copia[i] + ", ");
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
