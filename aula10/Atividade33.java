package aula10;

public class Atividade33 {
    public static void main(String[] args) {
        int idade = 30;
        double tempo = 30.5;
        float fahrenheit = (float) 305.9;

        String x = Integer.toString(idade);
        String y = Double.toString(tempo);
        String z = Float.toString(fahrenheit);

        System.out.println("Valor int idade em String: " + x);
        System.out.println("Valor double tem em String: " + y);
        System.out.println("Valor float fahrenheit em String: " + z);

        
    }
}
