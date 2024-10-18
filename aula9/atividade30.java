package aula9;

import java.util.Scanner;

public class atividade30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ano, ano_nasc;

        System.out.print("Por favor insira o ano atual: ");
        ano = input.nextInt();

        System.out.print("Insira o seu ano de nascimento: ");
        ano_nasc = input.nextInt();

        int idade = idade(ano, ano_nasc);

        System.out.println("A idade atual é " + idade + " anos.");

    }

    public static int idade(int ano, int ano_nasc){

        int idade = ano - ano_nasc; 

        return idade;
    }
}
