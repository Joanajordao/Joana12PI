import java.util.Scanner;

public class atividade29 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Introduza a idade: ");
        int idade = input.nextInt();

        if (idade >= 18){
            mensagem_de_boas_vindas(input);
            System.out.println();
            menu_2(input);
        } else{
            mensagem_de_boas_vindas(input);
            System.out.println();
            menu(input);
        }
    }

    public static void mensagem_de_boas_vindas(Scanner input){

        String nome;

        System.out.print("Introduza o seu nome: ");
        nome = input.next();        

        System.out.println("Seja Bem Vindo " + nome);

    }

    public static void menu(Scanner input){

        int opcao;
    
        System.out.println("== Menu == \n 1 - Entradas\n 2 - Prato Carne\n 3 - Prato Peixe\n 4 - Sobremesa\n 5 - Sair");
        
        do{
            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Entradas:\n - Sopa de Caldo Verde\n - Pão com Azeitonas");
                    break;
                case 2:
                    System.out.println("Prato de Carne:\n - Carne Alentejana\n - Bitoque");
                    break;
                case 3:
                    System.out.println("Prato de Peixe:\n - Bacalhau com Natas\n - Polvo à Lagareiro");
                    break;
                case 4:
                    System.out.println("Sobremesa:\n - Mousse de Chocolate\n - Cheesecake de Frutos Vermelhos");
                    break;
                case 5:
                    System.out.println("Tenha uma Boa Refeição!");
                    break;            
            }
        }while(opcao != 5);
    }

    public static void menu_2(Scanner input){

        int opcao;

        System.out.println("== Menu == \n 1 - Entradas\n 2 - Prato Carne\n 3 - Prato Peixe\n 4 - Sobremesa\n 5 - Carta de Vinhos\n 6 - Sair");

        do{

            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Entradas:\n - Sopa de Caldo Verde\n - Pão com Azeitonas");
                    break;
                case 2:
                    System.out.println("Prato de Carne:\n - Carne Alentejana\n - Bitoque");
                    break;
                case 3:
                    System.out.println("Prato de Peixe:\n - Bacalhau com Natas\n - Polvo à Lagareiro");
                    break;
                case 4:
                    System.out.println("Sobremesa:\n - Mousse de Chocolate\n - Cheesecake de Frutos Vermelhos");
                    break;
                case 5:
                    System.out.println("Carta de Vinhos:\n - Vinho Tinto\n - Vinho Branco");
                    break;     
                case 6:
                    System.out.println("Tenha uma Boa Refeição!");
                    break;       
            }
        }while(opcao != 6);
    }
}
