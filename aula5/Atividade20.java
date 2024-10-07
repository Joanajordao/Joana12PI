import java.util.Scanner;
import java.util.Vector;

public class Atividade20 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num, soma = 0;

        Vector<Integer> numeros = new Vector<>();

        do { 
            System.out.print("Insira um número: ");
            num = input.nextInt();

            if (num != -1){
                numeros.add(num);
                soma += num;
            }            
        } while (num != -1);
        
        System.out.println("A soma dos números é: " + soma);

        input.close();


    }
}
