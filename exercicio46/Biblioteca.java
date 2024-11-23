package exercicio46;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livros> livros;

    //Construtor
    public Biblioteca() {
        livros = new ArrayList<>();
    }

    public void adicionarLivros(Livros livro){
        livros.add(livro);
    }

    public void listaLivros(){
        for(Livros livros: livros){
            System.out.println("Livro: " + livros.getTitulo());
        }
    }



}
