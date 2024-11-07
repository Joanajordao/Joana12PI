package aula15;

public class BoloMorango extends Bolo {

    //Construtor da classe
    public BoloMorango(int tamanho, boolean cobertura) {
        super("Morango", tamanho, cobertura);
    }

    @Override //Para chamar os métodos
    public void tipoConfecao(){
        System.out.println("Este bolo será confecionado na lareira");
    }
}
