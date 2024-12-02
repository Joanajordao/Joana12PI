package aula23;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //Criar uma variável de nomes que será do tipo String
        Collection<String> nomes = new ArrayList<>();

        //Adiciona um valor na arrayList
        nomes.add("Kevin");
        nomes.add("Maria");
        nomes.add("Josefina");

        System.out.println(nomes);

        //Adicionar um iterator que percorrer o ArrayList
        Iterator<String> iterator = nomes.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Verificar o tamanho com size()
        System.out.println("Verifica o tamanho do array: " + nomes.size());

        //Verifica se contém um nome
        System.out.println("Contém Kevin? " + nomes.contains("Kevin"));
        System.out.println("Contém Carlos? " + nomes.contains("Carlos"));

        //Remove um nome
        nomes.remove("Maria");
        System.out.println(nomes);

        //Verificar se a tabela está vazia
        System.out.println("Está vazia? " + nomes.isEmpty());

        //Apagar todos os dados
        nomes.clear();
        System.out.println("Está vazia? " + nomes.isEmpty());



    }
}
