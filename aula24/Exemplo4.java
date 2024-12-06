package aula24;

import java.util.LinkedList;

public class Exemplo4 {
    public static void main(String[] args) {
        //Criar uma linkedlist de amigos
        LinkedList<String> linkedlist = new LinkedList<>();

        //Adicionar uma lista de amigos
        linkedlist.add("Kevin");
        linkedlist.add("Maria");
        linkedlist.add("Hugo");
        linkedlist.add("Carlos");

        //Mostrar a fila
        System.out.println("Lista final: " + linkedlist);

        //Adicionar um novo amigo no inicio da lista
        linkedlist.addFirst("Ana");

        //Mostrar a fila
        System.out.println("Lista final: " + linkedlist);

        //Remover um amigo no primeiro e último lugar
        linkedlist.removeFirst();
        linkedlist.removeLast();

        //Mostrar a fila
        System.out.println("Lista final: " + linkedlist);

        //Percorrer com a lista Iterator
        var iterator = linkedlist.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
