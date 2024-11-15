package aula19.EmpresaAluguer;

public abstract class Veiculo {
    //Variáveis de instância
    private String tipo;
    private String marca;
    private String cor;
    private double preco;
    private int dias;

    //Variáveis para testar a interface
    private boolean alugar;
    private boolean devolver;

    //Construtor da classe
    public Veiculo(String tipo, String marca, String cor, double preco, int dias){
        this.tipo = tipo;
        this.marca = marca;
        this.cor = cor;
        this.preco = preco;
        this.dias = dias;
    }

    //GET e SET das variáveis da interface
    public boolean getAlugar() {
        return alugar;
    }

    public void setAlugar(boolean alugar) {
        this.alugar = alugar;
    }

    public Boolean getDevolver() {
        return devolver;
    }

    public void setDevolver(Boolean devolver) {
        this.devolver = devolver;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public int getDias(){
        return dias;
    }

    public void setDias(int dias){
        this.dias = dias;
    }

    public void exibirDetalhes(){
        System.out.println("Tipo de veículo: " + tipo);
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Preço de aluguer: " + (preco * dias));
    }

    //Forma de criação de um metodo abstrato
    public abstract void acelerar();
    public abstract void travar();
}
