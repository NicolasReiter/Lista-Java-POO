package POO.HerancaEPolimorfismo.Ex9;

public class Aluno extends Pessoa{
    String curso;

    public Aluno(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }


    public void mostraDados() {
        System.out.println("Nome da pessoa: " + nome);
        System.out.println("Idade da pessoa: " + idade);
        System.out.println("Curso do aluno: " + curso);
    }
}
