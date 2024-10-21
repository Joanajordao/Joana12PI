public class Atividade35 {
    public static void main(String[] args) {
        double [] notas = {12.4, 14.7, 18, 16.5, 10.9, 17.2};
        double soma = 0, media_double;


        for(int i = 0; i <  notas.length; i++){
            soma += notas[i];
        }
        media_double = soma / notas.length;
        int media_int = (int) media_double; // typecast implicita

        System.out.println("Número total de alunos: " + notas.length);
        System.out.println("Média das notas(original): " + media_double);
        System.out.println("Média das notas(convertida para int): " + media_int);
    }
}
