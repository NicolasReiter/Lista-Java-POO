package POO;

public class Principal {

    public static void main(String[] args) {
        Universidade princenton = new Universidade("Princenton");
        Universidade cambridge = new Universidade("Cambridge");

        Pessoa einstein = new Pessoa(14, 3, 1879);
        einstein.setNome("Albert Einstein");
        int idadeAtualEinstein = einstein.caculaIdade(einstein.ano);
        System.out.println("Idade de " + einstein.informaNome() + " se ele ainda estive vivo: " + idadeAtualEinstein);
        einstein.setUniversidade(princenton);

        Pessoa newton = new Pessoa(4, 1, 1643);
        newton.setNome("Isaac Newton");
        int idadeAtualNewton = newton.caculaIdade(newton.ano);
        System.out.println("Idade de " + newton.informaNome() + " se ele ainda estive vivo: " + idadeAtualNewton);
        newton.setUniversidade(cambridge);

        System.out.println(einstein);
        System.out.println(newton);
    }
}
