import java.util.Scanner;

public class atividade28 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Introduza a idade: ");
        int idade = input.nextInt();

        if (idade >= 18){
            mensagem_de_boas_vindas();
            System.out.println();
            menu_2();
        } else{
            mensagem_de_boas_vindas();
            System.out.println();
            menu();
        }
        input.close();
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
        System.out.println("== Menu == \n 1 - Entradas\n 2 - Prato Carne\n 3 - Prato Peixe\n 4 - Sobremesa\n 5 - Sair");
    }

    public static void menu_2(){
        System.out.println("== Menu == \n 1 - Entradas\n 2 - Prato Carne\n 3 - Prato Peixe\n 4 - Sobremesa\n 5 - Carta de Vinhos\n 6 - Sair");
    }
}
