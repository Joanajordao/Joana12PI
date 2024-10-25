import java.util.Scanner;

public class Atividade37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("== Inserir números para efetuar a divisão ==");
        try{
            int n1;
            String n2;
            do{
                System.out.print("Introduza o primeiro número: ");
                n1 = input.nextInt();
                System.out.print("Introduza o segundo número: ");
                input.nextLine();
                n2 = input.nextLine();

                if (n2.isEmpty()){
                    System.out.println("O valor não pode ser vazio");
                    continue;
                } 

                int n = Integer.parseInt(n2);
                float div = n1 / n;
                System.out.println("A divisão dos números é " + div);
            
            }while(n2.isEmpty());


        } catch (java.lang.ArithmeticException e){
            System.out.println("Erro: Não é possível dividir por zero.");

        }catch (NumberFormatException e){
            System.out.println("Erro: O valor não pode ser vazio ou contar apenas espaços.");
        }
    }
}
