package aula19.EmpresaAluguer;

public class Mota extends Veiculo{

    //Construtor da classe
    public Mota (String marca, String cor, double preco){
        super("Mota", marca, cor, preco);
    }

    @Override
    public void acelerar(){
        System.out.println("Acelera");
    }
    @Override
    public void travar(){
        System.out.println("Trava");
    }
    @Override
    public void precoAluguer(double preco, int dias){
        preco = preco * dias;
    }
}
