public class Atividade23 {
    public static void main(String[] args) {
        // Atraves de duas variaveis inteiras cria uma array de 3 dimensões
        int array [][][] = new int [3][3][3];

        for (int i = 0; i < array.length; i++){
            for (int x = 0; x < array.length; x++){
                for (int y = 0; y < array.length; y++){
                    System.out.printf("%d\t", array[i][y][x]);
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
    }
}
