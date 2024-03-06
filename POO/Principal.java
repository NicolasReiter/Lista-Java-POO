package POO;

public class Principal {

    public static void main(String[] args) {
        Universidade princenton = new Universidade("Princenton");
        Universidade cambridge = new Universidade("Cambridge");

        Departamento juridico = new Departamento("Jurídico");
        Departamento fisica = new Departamento("Física");
        Departamento economia = new Departamento("Economia");
        Departamento artes = new Departamento("Artes");
        Departamento esportes = new Departamento("Esportes");
        Departamento tecnoligia = new Departamento("Tecnologia");

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

        einstein.setDepartamento(juridico);
        newton.setDepartamento(fisica);

        princenton.add(fisica);
        princenton.add(tecnoligia);
        cambridge.add(esportes);
        cambridge.add(juridico);
        cambridge.add(artes);
        cambridge.add(economia);

        for (int i = 0; i < princenton.size(); i++) {
            (princenton.get(i)).setUniversidade(princenton);
        }
        for (int i = 0; i < cambridge.size(); i++) {
            (cambridge.get(i)).setUniversidade(cambridge);
        }

        if (princenton.size() > 50) {
            throw new IndexOutOfBoundsException("Máximo de 50 departamentos");
        }
    }
}
