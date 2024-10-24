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
                n2 = input.next();

                if (" ".equals(n2)){
                    System.out.println("Inválido.");
                }
                int n = Integer.parseInt(n2);

                float div = n1 / n;
                System.out.println("A divisão dos números é " + div);

            }while(" ".equals(n2));


        } catch (java.lang.ArithmeticException e){
            System.out.println("Erro: Não é possível dividir por zero.");

        }catch (Exception e){
            System.out.println("O valor não pode ser vazio ou contar apenas espaços.");
        }
        


    }
}
