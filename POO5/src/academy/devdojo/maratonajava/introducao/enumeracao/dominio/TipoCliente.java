package academy.devdojo.maratonajava.introducao.enumeracao.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");
    
    public final int VALOR;
    public String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
        for (TipoCliente tipoClient : values()) {
            if(tipoClient.getNomeRelatorio().equals(nomeRelatorio)) {
                return tipoClient;
            }
        }
        return null;
    }

    public int getVALOR() {
        return VALOR;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    
    
}
