package aula15;

public class BoloChocolate extends Bolo implements Personalizavel{

    //Construtor da classe 
    public BoloChocolate(int tamanho, boolean cobertura) {
        //"super" Serve para fazer chamadas da super classe
        super("Chocolate", tamanho, cobertura);
    }

    @Override
    public void tipoConfecao(){
        System.out.println("Este bolo vai ser confecionado no forno");
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes(); //Herança do bolo

        //Condição lógica
        if(getMensagem() != null){
            System.out.println("Mensagem a apresentar: " + getMensagem());
        }
        if(getCorDecoracao() != null){
            System.out.println("A cor do bolo será: " + getCorDecoracao());
        }
    }

    //Implementaçao dos métodos da interface
    @Override
    public void definirMensagem(String mensagem){
        setMensagem(mensagem);
    }

    @Override
    public void corDecoracao(String corDecoracao){
        setCorDecoracao(corDecoracao);
    }
}
