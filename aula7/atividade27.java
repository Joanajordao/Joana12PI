import java.util.Scanner;

public class atividade27 {
    public static void main(String[] args) {
        mensagem_de_boas_vindas();
        System.out.println();
        menu();

    }

    public static void mensagem_de_boas_vindas(){

        String nome;
        Scanner input = new Scanner(System.in);

        System.out.print("Introduza o seu nome: ");
        nome = input.next();        

        System.out.println("Seja Bem Vindo " + nome);

        input.close();
    }

    public static void menu(){
        System.out.println("== Menu == \n 1 - Entradas\n 2 - Prato Carne\n 3 - Prato Peixe\n 4 - Sobremesa\n 5 - Sair ");
    }
}