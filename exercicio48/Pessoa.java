package exercicio48;

public class Pessoa {
    //Variáveis de instância
    private String nome;
    private String idade;
    private char genero;

    //Métodos GETTERS
    public String getNome() {
        return nome;
    }

    public String getIdade() {
        return idade;
    }

    public char getGenero() {
        return genero;
    }

    //Construtor
    public Pessoa(String nome, String idade, char genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public void fazerAniv(){

    }

}
