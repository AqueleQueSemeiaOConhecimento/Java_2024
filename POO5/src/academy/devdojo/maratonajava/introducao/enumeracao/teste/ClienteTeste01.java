package academy.devdojo.maratonajava.introducao.enumeracao.teste;

import academy.devdojo.maratonajava.introducao.enumeracao.dominio.Cliente;
import academy.devdojo.maratonajava.introducao.enumeracao.dominio.TipoCliente;
import academy.devdojo.maratonajava.introducao.enumeracao.dominio.TipoPagamento;

public class ClienteTeste01 {
    public static void main(String[] args) {
     Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA);
     Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA);   
     System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
     TipoCliente pessoaFisica = TipoCliente.valueOf("PESSOA_FISICA");
     System.out.println(pessoaFisica.getNomeRelatorio());
    }
}
