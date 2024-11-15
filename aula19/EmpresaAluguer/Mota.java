package aula19.EmpresaAluguer;

public class Mota extends Veiculo{

    //Construtor da classe
    public Mota (String marca, String cor, double preco, int dias){
        super("Mota", marca, cor, preco, dias);
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
