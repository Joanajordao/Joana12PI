package aula17;

public class Casa {
    //Variáveis de instância
    private int quartos;
    private int casa_de_banho;
    private String rua;

    //Construtor da classe
    public Casa(int quartos, int casa_de_banho, String rua){
        if(quartos <= 5){
            this.quartos = quartos;
        }
        if(casa_de_banho <= 4){
            this.casa_de_banho = casa_de_banho;
        }
        this.rua = rua;
    }

    //Métodos Getter e Setter
    public int getQuartos(){
        return quartos;
    }

    public void setQuartos(){
            this.quartos = quartos;
    }

    public int getCasa_de_banho(){
        return casa_de_banho;
    }

    public void setCasa_de_banho(){
        this.casa_de_banho = casa_de_banho;
    }

    public String getRua(){
        return rua;
    }

    public void setRua(){
        this.rua = rua;
    }

    public void exibirDetalhes(){
        System.out.println("Nº de quartos: " + quartos);
        System.out.println("Nº de casa de banhos: " + casa_de_banho);
        System.out.println("Nome da rua: " + rua);
    }
}
