package exercicio46;

public class Main {
    public static void main(String[] args) {
        //Instânciar a classe
        Livros livro1 = new Livros("Saga - A guerra santa do fred na wc");
        Livros livro2 = new Livros("Saga - Pobre de quem for depois do fred");
        Livros livro3 = new Livros("Saga - O problema de quem passa muito tempo na sanita by fred");

        Biblioteca biblioteca = new Biblioteca();

        //Adicionar os livros na biblioteca
        biblioteca.adicionarLivros(livro1);
        biblioteca.adicionarLivros(livro2);
        biblioteca.adicionarLivros(livro3);

        biblioteca.listaLivros();
    }
}
