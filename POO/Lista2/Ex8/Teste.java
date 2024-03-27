package POO.Lista2.Ex8;

public class Teste {
    public static void main(String[] args) {
        Pessoa doris = new Pessoa("Doris");
        Pessoa samuel = new Pessoa("Samuel");
        Pessoa gomes = new Pessoa("Gomes");
        Pessoa sarah = new Pessoa("Sarah");
        Pessoa pedro = new Pessoa("Pedro");
        Pessoa anna = new Pessoa("Anna");

        Pessoa martins = new Pessoa("Martins", gomes, sarah);
        Pessoa maria = new Pessoa("Maria", samuel, doris);
        Pessoa rodrigo = new Pessoa("Rodrigo", gomes, sarah);
        Pessoa manuela = new Pessoa("Manuela", pedro, anna);

        Pessoa vinicius = new Pessoa("Vinicius", martins, maria);
        Pessoa enzo = new Pessoa("Enzo", rodrigo, manuela);

        System.out.println("______Mesma_Pessoa?______");
        System.out.println(enzo.verificarIgualdade(enzo));
        System.out.println(vinicius.verificarIgualdade(maria));
        System.out.println("______São_Irmãos?______");
        System.out.println(martins.verificarIrmao(rodrigo));
        System.out.println(rodrigo.verificarIrmao(maria));
        System.out.println("______É_Seu_Antecessor?______");
        System.out.println(enzo.verificarAntecessor(sarah));
    }
}
