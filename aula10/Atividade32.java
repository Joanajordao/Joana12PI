package aula10;

public class Atividade32 {
    public static void main(String[] args) {
        String idade = "30";
        
        //Converção da variável string para int
        int x = Integer.parseInt(idade);

        //Converção da variável string para float
        float y = Float.parseFloat(idade);

        System.out.println("Valor int: " + x);
        System.out.println("Valor float: " + y);
    }
}
