package Teste;
import java.util.Scanner;

public class Exercicio3 {
    public static void main (String [] args) {
        /*
        1.
        Scanner input = new Scanner(System.in);
        int nota;

        do{
            System.out.print("Insira uma nota(0-10): ");
            nota = input.nextInt();
    
            if (nota >= 10 || nota < 0){
                System.out.println("Nota inválida! Tente novamente.");
            }
        }while(nota >= 10 || nota < 0);

        input.close();
        
        2.
        Scanner input = new Scanner(System.in);
        String nome, palav_passe;
        boolean a = false;

        do{
            System.out.print("Insira um nome: ");
            nome = input.next();
            System.out.print("Insira uma palavra-passe: ");
            palav_passe = input.next();

            if (nome.equals(palav_passe)){
                System.out.println("A senha não pode ser igual ao nome! Tente novamente.");
                a = true;
            } else {
                a = false;
            }
            
        }while(a == true);

        input.close();
        */

        //3. Faça um programa que leia e valide as seguintes informações:
        //a. Nome: maior que 3 caracteres
        //idade: entre 0 a 150
        //salário: maior que 0
        //sexo: 'f' ou 'm'
        //estado civil: 's', 'c', 'v', 'd'
        Scanner input = new Scanner(System.in);
        
            System.out.print("Insira o nome: ");
            String nome = input.next();

            System.out.print("Insira a idade: ");
            int idade = input.nextInt();

            System.out.print("Insira o salário: ");
            double salario = input.nextDouble();

            System.out.print("Insira o sexo('f'/'m'): ");
            char sexo = input.next().charAt(0);

            System.out.print("Insira o estado civil('s','c','v','d'): ");
            char estado = input.next().charAt(0);


        input.close();




    





    }
}
