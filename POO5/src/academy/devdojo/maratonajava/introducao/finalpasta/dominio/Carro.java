package academy.devdojo.maratonajava.introducao.finalpasta.dominio;

public final class Carro {
    private String nome; 
    /*final = constante*/
    private static final double VELOCIDADE_LIMITE;
    public final Comprador COMPRADOR = new Comprador(); 
    static {
        VELOCIDADE_LIMITE = 250;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public static double getVelocidadeLimite() {
        return VELOCIDADE_LIMITE;
    }
    public Comprador getCOMPRADOR() {
        return COMPRADOR;
    }

    

}
