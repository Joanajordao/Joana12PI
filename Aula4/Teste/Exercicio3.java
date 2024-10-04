package Teste;

import java.util.Scanner;
// import java.util.Arrays;

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
        

        //3. Faça um programa que leia e valide as seguintes informações:
        //a. Nome: maior que 3 caracteres
        //idade: entre 0 a 150
        //salário: maior que 0
        //sexo: 'f' ou 'm'
        //estado civil: 's', 'c', 'v', 'd'
        Scanner input = new Scanner(System.in);

        System.out.println("Início do programa");
        
        System.out.print("Insira o nome: ");
        String nome = input.nextLine();
        if (nome.length() > 3){
            System.out.println("Nome válido!");
        } else{
            System.out.println("Nome inválido!");
        }

        System.out.print("Insira a idade: ");
        int idade = input.nextInt();
        if (idade > 0 && idade < 150){
            System.out.println("Idade válida!");
        } else{
            System.out.println("Idade inválida!");
        }

        System.out.print("Insira o salário: ");
        double salario = input.nextDouble();
        if (salario > 0){
            System.out.println("Salário válido!");
        } else {
            System.out.println("Salário inválido!");
        }

        System.out.print("Insira o sexo('f'/'m'): ");
        char sexo = input.next().charAt(0);
        if (sexo == 'f' || sexo == 'm'){
            System.out.println("Sexo válido!");
        } else {
            System.out.println("Sexo inválido!");
        }

        System.out.print("Insira o estado civil('s','c','v','d'): ");
        char estado = input.next().charAt(0);
        if (estado == 's' || estado == 'c' || estado == 'v' || estado == 'd'){
            System.out.println("Estado civil válido!");
        } else{
            System.out.println("Estado civil inválido!");
        }

        input.close();
        

        //6. Faça um programa que imprima na tela os números de 1 a 20, um em baixo do outro. Depois modifique o programa para que ele mostre os números um lado do outro.

        int [] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        for (int i = 0; i < 20; i++){
            System.out.println(numeros[i]);
        }
        //ou
        for (int i = 0; i < 20; i++){
            System.out.print(numeros[i] + " ");
        }
        
        //7. Faça um programa que leia 5 números e informe o maior número.

        Scanner input = new Scanner(System.in);

        int [] numero = new int [5];

        for (int i = 0; i < 5; i++){
            System.out.print("Insira um número: ");
            numero[i] = input.nextInt();
        }
        Arrays.sort(numero);
        System.out.println("O maior número é o " + numero[4]);
             
        input.close();

        //8. Faça um programa que leia 5 números e informe a soma e a média dos números.

        Scanner input =  new Scanner(System.in);

        int numeros = 0;

        for (int i = 0; i < 5; i++){
            System.out.print("Insira um número: ");
            numeros += input.nextInt();
        }

        System.out.println("A soma dos números é " + numeros);
        double media = numeros / 5;
        System.out.println("A média dos números é " + media);
        

        //9. Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.

        System.out.println("Números ímpares de 1 a 50: ");
        for (int i = 0; i < 50; i++){
            if (i % 2 != 0){
                System.out.print(i + " ");
            }
        }
        

        //10. Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.

        Scanner input =  new Scanner(System.in);

        System.out.print("Insere o primeiro número: ");
        int numero1 = input.nextInt();

        System.out.print("Insira o segundo número: ");
        int numero2 = input.nextInt();

        for (int i = numero1; i < numero2; i++){
            System.out.print(i + " ");
        }
        */
        
        //11. Altere o programa anterior para mostrar no final a soma dos números.

        Scanner input = new Scanner(System.in);

        int soma = 0;

        System.out.print("Insere o primeiro número: ");
        int numero1 = input.nextInt();

        System.out.print("Insira o segundo número: ");
        int numero2 = input.nextInt();

        for (int i = numero1; i < numero2; i++){
            System.out.print(i + " ");
            soma += i;
        }

        System.out.println("A soma dos números é " + soma);








    }
}
