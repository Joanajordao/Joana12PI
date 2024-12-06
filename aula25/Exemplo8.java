package aula25;
import java.util.LinkedList;
import java.util.Queue;

public class Exemplo8 {
    public static void main(String[] args) {
        //Criar lista queue
        Queue<Integer> numeros = new LinkedList<>();

        //Adicionar números à lista
        numeros.add(23);
        numeros.add(39);
        numeros.add(76);

        //Exibir primeiro elemento
        System.out.println("Primeiro elemento: " + numeros.peek());

        //Eliminar elementos
        System.out.println("Elemento removido(poll): " + numeros.poll());

        //Exibir primeiro elemento
        System.out.println("Primeiro elemento: " + numeros.peek());

        //Verificar se a lista está vazia
        System.out.println("A lista está vazia? " + numeros.isEmpty());

    }
}
