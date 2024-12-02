package exercicio48;

public class Livro {
    //Variáveis de instância
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //Construtor da classe
    public Livro(String titulo, String autor, int totPaginas, int pagAtual, boolean aberto, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = pagAtual;
        this.aberto = aberto;
        this.leitor = leitor;
    }

    //Métodos GETTERS
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    //@Override
    public void abrir(Boolean aberto){
        aberto = true;
    }

    //@Override
    public void fechar(Boolean aberto){
        aberto = false;
    }

    public void exibirDetalhes(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Total de páginas: " + totPaginas);
        System.out.println("Página atual: " + pagAtual);
        System.out.println("Aberto?: " + (aberto ? "Sim" : "Não"));
        System.out.println("Leitor: " + leitor);
    }
}
