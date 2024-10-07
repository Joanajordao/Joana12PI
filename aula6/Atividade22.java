import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Atividade22 {
    public static void main(String[] args) {
        //Leia nomes, sendo que para terminar o utilizador tem que inserir a palavra "sair" e liste-os. E peça ao utilizador para inserir nove números inteiros, aleatoriamente, e os ordene de forma crescente.
        String nome;

        Scanner input = new Scanner(System.in);

        Vector<String> nomes = new Vector<>();
        int [] numero = new int [9];

        do{
            System.out.print("Insira um nome('sair' para cancelar): ");
            nome = input.next();
            if(!"sair".equals(nome)){
                nomes.add(nome);
            }
        }while(!"sair".equals(nome));

        System.out.println(nomes);

        for(int i = 0; i < 9; i++){
            System.out.print("Insira um número: ");
            numero[i] = input.nextInt();
        }
        Arrays.sort(numero);

        for(int y = 0; y < 9; y++){
            System.out.print(numero[y] + " ");
        }
        input.close();
    }
}
