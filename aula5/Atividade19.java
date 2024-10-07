import java.util.Scanner;
import java.util.Vector;

public class Atividade19 {

    public static void main(String[] args) {
        //Cria objeto scanner
        Scanner input = new Scanner(System.in);

        //Cria um vector para armazenar os números inseridos pelo utilizador
        Vector<Integer> numeros = new Vector<>();

        int num, soma = 0;

        //Lê os números do utilizador até inserir 0
        //Cria o loop de pedido de numeros ao utilizador
        do { 
            System.out.print("Insira um número (0 para cancelar): ");
            //Pede ao utilizador um número
            num = input.nextInt();

            if (num != 0) {
                //Adicionar os números ao vector
                numeros.add(num);

                //Soma os valores que o utilizador insere
                soma += num;
            }
        } while (num != 0);

        //Calcula o resto da divisão por 2
        int resto = soma % 2;
        //Apresenta o valor total dos números inseridos pelo utilizador
        System.out.println("Resto de todos os números somados: " + resto);
        
        input.close();
    }
}
