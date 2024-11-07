package aula19.EmpresaAluguer;

public class Carro extends Veiculo{

    //Construtor da classe
    public Carro (String marca, String cor, double preco){
        super("Carro", marca, cor, preco);
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
