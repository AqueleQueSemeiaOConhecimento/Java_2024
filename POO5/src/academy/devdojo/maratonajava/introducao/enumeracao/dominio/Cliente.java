package academy.devdojo.maratonajava.introducao.enumeracao.dominio;

public class Cliente {
    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;


    public Cliente(String nome, TipoCliente tipoCliente) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }
   
    

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", tipoCliente=" + tipoCliente + " , tipoClienteInt " + tipoCliente.getVALOR() + "]";
    }



    public Cliente() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }



    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }



    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    
    
    
}
