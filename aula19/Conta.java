package aula19;

public class Conta {
    private double saldo;

    public void depositar(double valor){
        saldo += valor;
    }

    public void levantar(double valor){
        saldo -= valor;
    }

    public double getSaldo(){
        return this.saldo;
    }
}
