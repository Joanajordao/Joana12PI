package exercicio32;
import java.util.Scanner;

public class Conta {
    //Variáveis de instância
    public double saldo = 0;
    

    Scanner input = new Scanner(System.in);

    public void definir_metodo(){
        System.out.print("Saldo atual: ");
        saldo = input.nextDouble();
    }

    public void obter_saldo(){
        System.out.println("Saldo da conta: " + saldo);
    }

    public void depositar(){
        System.out.print("Depositar: ");
        double depositar = input.nextDouble();
        saldo += depositar;
    }

    public void levantar(){
        System.out.print("Levantar: ");
        double levantar = input.nextDouble();
        saldo -= levantar;
    }
}
