public class Atividade8 {
    public static void main(String[] args) {

        int [] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String [] mes = {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"};

        for(int i = 0; i < 12; i++){
            System.out.println("O mês de " + mes[i] + " tem " + dias[i] + " dias.");
        }
    }
}
