package aula19.EmpresaAluguer;

public class Mota extends Veiculo implements Alugavel{

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

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();//Herança do veiculo

        if(getAlugar() == true){
            System.out.println("Alugar: " + getAlugar());
        }
        if(getDevolver() == true){
            System.out.println("Devolver: " + getDevolver());
        }

    }
    
}
