package aula22;

public class Escola {
    //Associação simpes
    public void darAulas(Professor professor, Aluno aluno){
        System.out.println("O professor " + professor.getNome() + " dá aulas ao " + aluno.getNome());
    }
}
