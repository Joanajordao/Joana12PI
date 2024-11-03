package aula18;

public class Data {
    //variáveis de instância
    private int dia = 1;
    private int mes = 1;
    private int ano = 1;

    //Cosntrutor da classe
    public Data(int dia, int mes, int ano){
        if (dia >= 1 && dia <= 31){
            this.dia = dia;
        }

        if (mes >= 1 && mes <= 12){
            this.mes = mes;
        }

        if (ano > 0){
            this.ano = ano;
        }
    }

    public void setData(){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    //O Get obtêm valores finais
    public int getDia(){
        return dia;
    }

    public int getMes(){
        return mes;
    }

    public int getAno(){
        return ano;
    }

    public void exibirDetalhes(){
        System.out.println("Dia: " + dia);
        System.out.println("Mês: " + mes);
        System.out.println("Ano: " + ano);
    }
}
