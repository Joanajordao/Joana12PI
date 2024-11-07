package aula19;

public class Main {
    public static void main(String[] args) {
        Conta contaBancaria = new Conta();

        contaBancaria.depositar(100);
        System.out.println("Saldo atual da conta: " + contaBancaria.getSaldo());

        contaBancaria.levantar(45);
        System.out.println();
        System.out.println("Saldo atual da conta: " + contaBancaria.getSaldo());
    }
}
