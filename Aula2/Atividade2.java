public class Atividade2 {
    public static void main(String[] args) {
        char letra = 'b';
        
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            System.err.println("É uma vogal");
        } else {
            System.err.println("É uma consoante");
        }

        // OU

        switch (letra) {
            case 'a':
                System.out.println("É uma vogal");
                break;
            case 'e':
                System.out.println("É uma vogal");
                break;
            case 'i':
                System.out.println("É uma vogal");
                break;
            case 'o':
                System.out.println("É uma vogal");
                break;
            case 'u':
                System.out.println("É uma vogal");
                break;
            default:
                System.out.println("É uma consoante");
                break;
        }
    }
}


