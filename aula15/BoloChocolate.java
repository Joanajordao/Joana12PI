package aula15;

public class BoloChocolate extends Bolo{

    //Construtor da classe 
    public BoloChocolate(int tamanho, boolean cobertura) {
        //"super" Serve para fazer chamadas da super classe
        super("Chocolate", tamanho, cobertura);
    }

    @Override
    public void tipoConfecao(){
        System.out.println("Este bolo vai ser confecionado no forno");
    }
}
