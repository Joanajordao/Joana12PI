package aula15;

public class Main {
    public static void main(String[] args) {

        //Testar interface
        Bolo boloAniversario = new BoloChocolate(30, false);

        boloAniversario.setMensagem("Feliz Aniversário!");
        boloAniversario.setCorDecoracao("Azul");
        boloAniversario.exibirDetalhes();

        //Instanciar o objeto da classe == Criar um objeto da classe Bolo
        //Testar a abstração
        //BoloMorango boloMorango = new BoloMorango(75, false);
        //BoloChocolate boloChocolate = new BoloChocolate(30, true);

        /*boloChocolate.exibirDetalhes();
        boloChocolate.tipoConfecao();

        System.out.println();

        boloMorango.exibirDetalhes();
        boloMorango.tipoConfecao();

*/
        //Testar o polimorfismo
        //Bolo boloMorango = new BoloMorango(75, false);
        //Bolo boloChocolate = new BoloChocolate(30, true);
    }
}
