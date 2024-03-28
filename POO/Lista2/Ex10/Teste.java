package POO.Lista2.Ex10;

public class Teste {
    public static void main(String[] args) {
        Matriz matriz = new Matriz(3, 3);
        Matriz matriz2 = new Matriz(3, 3);

        matriz.setElemento(0, 0, 45);
        matriz.setElemento(0, 1, 11);
        matriz.setElemento(0, 2, 72);
        matriz.setElemento(1, 0, 5);
        matriz.setElemento(1, 1, 20);
        matriz.setElemento(1, 2, 1);
        matriz.setElemento(2, 0, 33);
        matriz.setElemento(2, 1, 38);
        matriz.setElemento(2, 2, 3);
        System.out.println("----MATRIZ 1----");
        System.out.print(matriz.toString());
        System.out.println("----------------\n");

        matriz2.setElemento(0, 0, 12);
        matriz2.setElemento(0, 1, 37);
        matriz2.setElemento(0, 2, 87);
        matriz2.setElemento(1, 0, 4);
        matriz2.setElemento(1, 1, 62);
        matriz2.setElemento(1, 2, 5);
        matriz2.setElemento(2, 0, 90);
        matriz2.setElemento(2, 1, 13);
        matriz2.setElemento(2, 2, 73);
        System.out.println("----MATRIZ 2----");
        System.out.print(matriz2.toString());
        System.out.println("----------------\n");

//        System.out.println("----TRANSPOSTA 1----");
//        System.out.print(matriz.transposta().toString());
//        System.out.println("--------------------");
//        System.out.println("----OPOSTA 2----");
//        System.out.print(matriz2.oposta().toString());
//        System.out.println("----------------");
//        System.out.println("----NULA 1----");
//        System.out.print(matriz.nula().toString());
//        System.out.println("--------------");

        Matriz matriz3 = new Matriz(3, 3);

        matriz3.setElemento(0, 0, 1);
        matriz3.setElemento(0, 1, 0);
        matriz3.setElemento(0, 2, 0);
        matriz3.setElemento(1, 0, 0);
        matriz3.setElemento(1, 1, 1);
        matriz3.setElemento(1, 2, 0);
        matriz3.setElemento(2, 0, 0);
        matriz3.setElemento(2, 1, 0);
        matriz3.setElemento(2, 2, 1);
        System.out.println("----MATRIZ 3----");
        System.out.print(matriz3.toString());
        System.out.println("----------------\n");

//        System.out.println("Matriz é Identidade?");
//        System.out.println(matriz3.identidade());
//        System.out.println("Matriz é Diagonal?");
//        System.out.println(matriz3.diagonal());
//        System.out.println("Matriz é Singular?");
//        System.out.println(matriz3.singular());
//        System.out.println("Matriz é Simétrica?");
//        System.out.println(matriz3.simetrica());
//        System.out.println("Matriz é Anti-simétrica?");
//        System.out.println(matriz3.antisimetrica());

        Matriz matriz4 = new Matriz(3, 3);
        Matriz matriz5 = new Matriz(3, 3);

        matriz4.setElemento(0, 0, 15);
        matriz4.setElemento(0, 1, 71);
        matriz4.setElemento(0, 2, 42);
        matriz4.setElemento(1, 0, 55);
        matriz4.setElemento(1, 1, 2);
        matriz4.setElemento(1, 2, 13);
        matriz4.setElemento(2, 0, 83);
        matriz4.setElemento(2, 1, 18);
        matriz4.setElemento(2, 2, 3);
        System.out.println("----MATRIZ 4----");
        System.out.print(matriz4.toString());
        System.out.println("----------------\n");

        matriz5.setElemento(0, 0, 22);
        matriz5.setElemento(0, 1, 57);
        matriz5.setElemento(0, 2, 67);
        matriz5.setElemento(1, 0, 1);
        matriz5.setElemento(1, 1, 32);
        matriz5.setElemento(1, 2, 57);
        matriz5.setElemento(2, 0, 9);
        matriz5.setElemento(2, 1, 43);
        matriz5.setElemento(2, 2, 23);
        System.out.println("----MATRIZ 5----");
        System.out.print(matriz5.toString());
        System.out.println("----------------");

//        System.out.println("----SOMA----");
//        System.out.print(matriz4.somar(matriz5).toString());
//        System.out.println("------------");

//        System.out.println("----SUBTRAÇÃO----");
//        System.out.print(matriz4.subtrair(matriz5).toString());
//        System.out.println("------------");

//        System.out.println("----MULTIPLICAÇÃO----");
//        System.out.print(matriz4.multiplicar(matriz5).toString());
//        System.out.println("------------");
    }
}
