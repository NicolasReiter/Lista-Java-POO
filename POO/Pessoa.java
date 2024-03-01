package POO;

import java.time.LocalDateTime;

public class Pessoa {

    int idade;
    int dia;
    int mes;
    int ano;
    String nome;
    Universidade universidade;
    Departamento departamento;

    public Pessoa(int dia, int mes, int ano) {
        setDia(dia);
        setMes(mes);
        setAno(ano);
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

    public String toString() {

        return "Pessoa: " + this.nome + " está na universidade: " + this.universidade.getNome();
    }

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
    public Universidade getUniversidade() {
        return universidade;
    }
    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }
    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
