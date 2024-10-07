package aula5;

public class Atividade18 {
    public static void main (String [] args){

        int soma = 0;
        int count = 0;
        
        for(int i = 0; i < 1000; i++){
            if (i % 3 == 0 && i % 5 == 0){
                soma += i;
                count += 1;
                System.out.print(i + " ");
                if (count == 5){
                    break;
                }
            }
        }
        System.out.println("\nA soma dos números diviseis por 3 e 5 é " + soma);
    }
}
