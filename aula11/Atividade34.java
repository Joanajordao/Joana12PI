import java.util.Scanner;

public class Atividade34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num;

        System.out.print("Insira um número decimal: ");
        num = input.nextDouble();

        //Typcast implicitas
        int x = (int) num;
        float y = (float) num;
        long z = (long) num;

        System.out.println("Número original: " + num);
        System.out.println("Número convertido para int: " + x);
        System.out.println("Número convertido para float: " + y);
        System.out.println("Número convertido para long: " + z);

        input.close();
    }
}
