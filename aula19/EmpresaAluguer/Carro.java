package aula19.EmpresaAluguer;

public class Carro extends Veiculo implements Alugavel{

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

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes(); //Herança do veiculo
        if (getAlugar() == true){
            System.out.println("Alugar: " + getAlugar());
        }
        if (getDevolver() == true){
            System.out.println("Devolver: " + getDevolver());
        }
    }

}
