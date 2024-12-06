package aula25;

import java.util.TreeSet;

public class Exemplo6 {
    public static void main(String[] args) {
        //Criar um objeto TreeSet
        TreeSet<Integer> numeros = new TreeSet<>();

        //Adicionar valores ao TreeSet
        numeros.add(-25);
        numeros.add(30);
        numeros.add(20);
        numeros.add(20);
        numeros.add(40);

        //Apresentar os valores ordenados
        System.out.println("Números no TreeSet(Ordenados): " + numeros);

        //Verificar qual é o menor e maior números
        System.out.println("Menor número: " + numeros.first());
        System.out.println("Maior número: " + numeros.last());

        //Remover os números 20
        numeros.remove(20);
        System.out.println("Remove os números 20: " + numeros);



    }
}
