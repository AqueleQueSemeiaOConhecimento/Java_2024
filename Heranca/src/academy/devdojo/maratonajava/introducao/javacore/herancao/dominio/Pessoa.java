package academy.devdojo.maratonajava.introducao.javacore.herancao.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endero;

    static {
        System.out.println("Dentro do bloco de unicialização estático de pessoa");
    }
    {
        System.out.println("Dentro do bloco de inicialização de pessoa 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de pessoa 2");
    }

    public Pessoa(String nome) {
        System.out.println("Dentro do construtor de pessoa");
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf) {
        this(nome);
        this.cpf = cpf;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endero.getRua()+" "+ this.endero.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndero() {
        return endero;
    }

    public void setEndero(Endereco endero) {
        this.endero = endero;
    }

    
}
