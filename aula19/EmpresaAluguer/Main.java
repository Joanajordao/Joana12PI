package aula19.EmpresaAluguer;

public class Main {
    public static void main(String[] args) {

        //Testar interface
        Veiculo carro = new Carro("Porche", "Amarelo", 560, 5);
        Veiculo mota = new Mota("Honda", "Prata", 60, 10);

        carro.setAlugar(true);
        carro.setDevolver(false);
        carro.exibirDetalhes();

        System.out.println();

        mota.setAlugar(false);
        mota.setDevolver(true);
        mota.exibirDetalhes();


        //Instanciar o objeto da classe == Criar um objeto da classe
        //Testar abstração
        //Carro carro = new Carro("Ferrari", "Vermelho", 550, 7);
        //Mota mota = new Mota("Honda", "Preto", 50, 15);

        /*carro.exibirDetalhes();
        carro.acelerar();
        carro.travar();

        System.out.println();

        mota.exibirDetalhes();
        mota.acelerar();
        mota.travar();


        //Testar polimorfismo
        Veiculo carro = new Carro("Ferrari", "Vermelho", 550, 7);
        Veiculo mota = new Mota("Honda", "Preto", 50, 15);

        carro.exibirDetalhes();
        carro.acelerar();
        carro.travar();

        System.out.println();

        mota.exibirDetalhes();
        mota.acelerar();
        mota.travar();
        */


        //implementar metodo calcularprecoaluguer(int dias) na classe veiculo

        //as subclasses devem implementar esse metodo
    }
}
