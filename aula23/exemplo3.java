package aula23;

import java.util.ArrayList;

public class exemplo3 {
    public static void main(String[] args) {
        //Array normal e fixo
        int[] numeros = new int[3];

        //Inserir valores nos indices do array fixo
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;

        System.out.println("Valores no array fixo: ");
        for(int i = 0; i <= 2; i++){
            System.out.println(numeros[i]);
        }

        //ArrayList Dinâmico
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(10);
        lista.add(20);
        lista.add(30);

        System.out.println("Valores no ArrayList: ");
        for(int valor: lista) {
            System.out.println(valor);
        }
    }
}
