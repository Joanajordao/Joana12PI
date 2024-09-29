import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        //Creates an object of Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Introduza o preço de um livro: ");
        //Takes the input from the keyboard
        double preco_livro = input.nextDouble();

        if (preco_livro < 20.00) {
            System.out.println("Barato");
        } else{
            System.out.println("Caro");
        }
        //closes the scanner
        input.close();

    }
}
