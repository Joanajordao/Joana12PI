package aula19.EmpresaAluguer;

public class Carro extends Veiculo{

    //Construtor da classe
    public Carro (String marca, String cor, double preco, int dias){
        super("Carro", marca, cor, preco, dias);
    }

    @Override
    public void acelerar(){
        System.out.println("Acelera");
    }
    @Override
    public void travar(){
        System.out.println("Trava");
    }

}
