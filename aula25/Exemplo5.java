package aula25;
import java.util.HashSet;

public class Exemplo5 {
    public static void main(String[] args) {
        //Criar um onjeto HashSet
        HashSet<String> amigos = new HashSet<>();

        //Criar uma lista de amigos
        amigos.add("Afonso");
        amigos.add("Diogo");
        amigos.add("Henrique");
        amigos.add("Diogo");

        //Mostrar a fila(Não vai ter repetição)
        System.out.println("Fila Inicial: " + amigos);

        //Verificar se um elemento existe
        System.out.println("Contém David? " + amigos.contains("David"));

        //Verificar o Tamanho do HashSet
        System.out.println("Tamanho da lista: " + amigos.size());


    }

}
