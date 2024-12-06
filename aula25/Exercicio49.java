package aula25;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Queue<String> fila = new LinkedList<>();
        boolean programa = true;

        do{
            System.out.println("*** SISTEMA DE ATENDIMENTO ***");
            System.out.println("1. Adicionar cliente");
            System.out.println("2. Ver próximo cliente");
            System.out.println("3. Atender cliente");
            System.out.println("4. Exibir fila");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do cliente: ");
                    String nome = input.next();
                    fila.add(nome);
                    break;
                case 2:
                    System.out.println("O próximo cliente é o/a " + fila.peek());
                    break;
                case 3:
                    System.out.println("Cliente atendido(removido): " + fila.poll());
                    break;
                case 4:
                    System.out.println("Fila atual: " + fila);
                    break;
                case 5:
                    System.out.println("A sair do programa...");
                    programa = false;
                    break;
            }
        }while(programa);
        input.close();
    }
}
