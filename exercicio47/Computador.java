package exercicio47;

public class Computador {
    //Variáveis de instância
    private CPU cpu;

    //Construtor
    public Computador(String modeloCPU) {
        this.cpu = new CPU(modeloCPU);//A CPU vai ser gerida pela classe computador
    }

    public void mostrarCPU(){
        System.out.println("Computador com  CPU " + cpu.getModelo());
    }




}
