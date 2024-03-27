package POO.Lista2.Ex8;

public class Pessoa {

    String nome;
    Pessoa pai;
    Pessoa mae;

    public Pessoa(String nome, Pessoa pai, Pessoa mae) {
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;
    }

    public Pessoa(String nome) {
        this.nome = nome;
        this.pai = null;
        this.mae = null;
    }

    public boolean verificarIgualdade(Pessoa pessoa) {
        return (this.getNome().equals(pessoa.getNome()) && this.getMae().equals(pessoa.getMae()));
    }

    public boolean verificarIrmao(Pessoa pessoa) {
        return (this.getPai().equals(pessoa.getPai()) && this.getMae().equals(pessoa.getMae()));
    }

    public boolean verificarAntecessor(Pessoa pessoa) {
        pai = this.getPai();
        mae = this.getMae();
        return (pai.equals(pessoa) || mae.equals(pessoa) ||
                pai.getPai().equals(pessoa.getPai()) || pai.getMae().equals(pessoa.getMae()) ||
                mae.getPai().equals(pessoa.getPai()) || mae.getMae().equals(pessoa.getMae())) ;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Pessoa getPai() {
        return pai;
    }
    public void setPai(Pessoa pai) {
        this.pai = pai;
    }
    public Pessoa getMae() {
        return mae;
    }
    public void setMae(Pessoa mae) {
        this.mae = mae;
    }
}
