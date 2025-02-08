package aula23;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class exemplo2 {
    public static void main(String[] args) {
        //criar uma lista de strings
        List<String> nomes = new ArrayList<>();

        //Adiciona um valor na arrayList
        nomes.add("Kevin");
        nomes.add("Maria");
        nomes.add("Josefina");
        nomes.add("Cremilde");

        System.out.println(nomes);

        //Criar uma sublista
        List<String> sublista = nomes.subList(1, 3);
        System.out.println("Sbulista: " + sublista);


        /*
        //Ordenar uma lista por ordem crescente: Usar Classe Collection
        Collections.sort(nomes);
        System.out.println("Depois de ordenar: " + nomes);

        //Ordenar uma lista por ordem decrescente
        Collections.sort(nomes, Collections.reverseOrder());
        System.out.println("Depois de ordenar de forma <: " + nomes);
         */

        /*
        //Aceder a elementos pelo indice
        System.out.println("Elemento na posição 1: " + nomes.get(1));

        //Substituir um elemento
        nomes.set(2, "Cristiano");

        System.out.println(nomes);

        //Remover um elemento - interface collection
        nomes.remove(2);

        System.out.println(nomes);*/
    }
}
