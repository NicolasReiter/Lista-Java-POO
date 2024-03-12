package EstruturasDeDados.Ex1;

import java.util.Scanner;

public class Empregado {
    String nome;
    int cpf;
    double salario;
    Empregado empregados[] = new Empregado[5];
    Scanner teclado = new Scanner(System.in);


    public void armazena() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Qual o nome do empregado?");
            String nome = teclado.next();
            System.out.println("Qual o cpf do empregado?");
            int cpf = teclado.nextInt();
            System.out.println("Qual o salário do empregrado?");
            double salario = teclado.nextDouble();

            Empregado empregado = new Empregado();
            empregado.setNome(nome);
            empregado.setCpf(cpf);
            empregado.setSalario(salario);
            empregados[i] = empregado;
        }
    }

    public void organizaSalario() {
        for (int i = 0; i < empregados.length; i++) {
            for (int j = 0; j < empregados.length - 1; j++) {
                if (empregados[j].getSalario() > empregados[j + 1].getSalario()) {
                    int guardar = (int) empregados[j].getSalario();
                    empregados[j].setSalario(empregados[j + 1].getSalario());
                    empregados[j + 1].setSalario(guardar);
                }
            }
        }
        for (int i = 0; i < empregados.length; i++) {
            for (int j = 0; j < empregados.length - 1; j++) {
                if (empregados[j].getSalario() > empregados[j + 1].getSalario()) {
                    int guardar = (int) empregados[j].getSalario();
                    empregados[j].setSalario(empregados[j + 1].getSalario());
                    empregados[j + 1].setSalario(guardar);
                }
            }
            System.out.print(empregados[i].getSalario() + " ");
        }
        System.out.println("\n");
    }

    public void remover(int desempregado) {
        empregados[desempregado - 1] = null;
        for (int i = 0; i < empregados.length; i++) {
            if (empregados[i] != null) {
                System.out.println("[" + empregados[i].getNome() + ", " + empregados[i].getCpf() + ", " + empregados[i].getSalario() + "]");
            }
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