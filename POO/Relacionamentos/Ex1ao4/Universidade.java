package POO.Relacionamentos.Ex1ao4;

import java.util.ArrayList;

public class Universidade extends ArrayList<Departamento> {

    String nome;

    Departamento departamento;

    public Universidade(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
