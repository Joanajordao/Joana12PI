package aula22;

public class Main {
    public static void main(String[] args) {
        //Criar um objeto das classes criadas
        Professor professor = new Professor("Maria");
        Aluno aluno = new Aluno("Vicente");
        Escola escola = new Escola();

        //Chamar o metodo
        escola.darAulas(professor, aluno);
    }
}
