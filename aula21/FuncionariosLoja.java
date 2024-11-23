public class FuncionariosLoja {
    //Variáveis de instância
    private String nome;
    private String data_nasc;
    private String funcao;
    private double salario;

    //Construtor da classe 
    public FuncionariosLoja(String nome, String data_nasc, String funcao, double salario){
        this.nome = nome;
        this.data_nasc = data_nasc;
        this.funcao = funcao;
        this.salario = salario;
    }

    //SET e GET das variáveis
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void exibirDetalhes(){
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + data_nasc);
        System.out.println("Função do funcionário: " + funcao);
        System.out.println("Salário Mensal: " + salario);
    }

}
