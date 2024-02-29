package POO;

import java.time.LocalDateTime;

public class Pessoa {

    int idade;
    int dia;
    int mes;
    int ano;
    String nome;

    public Pessoa(int dia, int mes, int ano) {
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    public static void main(String[] args) {
        Pessoa einstein = new Pessoa(14, 3, 1879);
        einstein.setNome("Albert Einstein");
        int idadeAtualEinstein = einstein.caculaIdade(einstein.ano);
        System.out.println("Idade de " + einstein.informaNome() + " se ele ainda estive vivo: " + idadeAtualEinstein);

        Pessoa newton = new Pessoa(4, 1, 1643);
        newton.setNome("Isaac Newton");
        int idadeAtualNewton = newton.caculaIdade(newton.ano);
        System.out.println("Idade de " + newton.informaNome() + " se ele ainda estive vivo: " + idadeAtualNewton);
    }

    public int caculaIdade(int ano) {
        LocalDateTime tempoAtual = LocalDateTime.now();
        return tempoAtual.getYear() - ano;
    }

//    public void ajustaDataDeNascimento(int dia, int mes, int ano) {
//        setDia(dia);
//        setMes(mes);
//        setAno(ano);
//    }

    public int informaIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String informaNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

}
