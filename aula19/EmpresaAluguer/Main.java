package aula19.EmpresaAluguer;

public class Main {
    public static void main(String[] args) {

        //Instanciar o objeto da classe == Criar um objeto da classe
        //Testar abstração
        Carro carro = new Carro("Ferrari", "Vermelho", 85000);
        Mota mota = new Mota("Honda", "Preto", 1500);

        carro.exibirDetalhes();
        carro.acelerar();
        carro.travar();

        System.out.println();

        mota.exibirDetalhes();
        mota.acelerar();
        mota.travar();
    }
}
