package aula15;

public class Main {
    public static void main(String[] args) {
        //Instanciar o objeto da classe == Criar um objeto da classe Bolo
        Bolo boloAniversario = new Bolo("Morango", 30, false);

        Bolo bolojoana = new Bolo("Chocolate", true);

        //Definir os detalhes do bolo
        //boloAniversario.setSabor("Morango");
        //boloAniversario.setTamanho(30);
        //boloAniversario.setCobertura(false);

        //Mostrar os detalhes do bolo
        boloAniversario.exibirDetalhes();

        //Alterar a cobertura
        boloAniversario.adicionarCobertura();

        //Adicionoi um enter
        System.out.println();
        
        //Mostrar detalhes atualizados
        boloAniversario.exibirDetalhes();
    }
}
