package aula15;
//Criação de uma classe que não tem o método main
public class Bolo {
    //Variáveis de instância
    private String sabor;
    private int tamanho;
    private boolean cobertura;

    public String getSabor(){
        return sabor;
    }

    public void setSabor(String sabor){
        this.sabor = sabor; // a variável de instância recebe a variável que o utilizador vai inserir o valor
    }

    public int getTamanho(){
        return tamanho;
    }

    public void setTamanho(int tamanho){
        this.tamanho = tamanho; 
    }

    public boolean getCobertura(){
        return cobertura;
    }

    public void setCobertura(boolean cobertura){
        this.cobertura = cobertura;
    }

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
