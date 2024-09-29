import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {

        int [] dias ={31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String [] mes = {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"};

        Scanner input = new Scanner(System.in);

        System.out.print("Input the year: ");
        int ano = input.nextInt();

        if (ano % 4 == 0){
            System.out.println("É um ano BISSEXTO!");
            for (int i = 0; i < 12; i++){
                System.out.println("O mês de " + mes[i] + " tem " + dias[i] + " dias.");
            }
        } else {
            dias[1] = 28;
            System.out.println("NÃO é um ano BISSEXTO!");
            for (int i = 0; i < 12; i++){
                System.out.println("O mês de " + mes[i] + " tem " + dias[i] + " dias.");
            }
        }

        input.close();
    }
}
