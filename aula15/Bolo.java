package aula15;
//Criação de uma classe que não tem o método main
public class Bolo {
    //Variáveis de instância
    public String sabor;
    public int tamanho;
    public boolean cobertura;

    //Apresenta os detalhes do bolo
    public void exibirDetalhes(){
        System.out.println("Sabor do bolo: " + sabor);
        System.out.println("Tamanho do bolo: " + tamanho + "cm");
        System.out.println("Cobertura: " + (cobertura ? "Sim": "Não"));
    }

    //Adiciona cobertura no bolo
    public void adicionarCobertura(){
        cobertura = true;
    }



}
