package academy.devdojo.maratonajava.introducao.javacore.herancao.teste;

import academy.devdojo.maratonajava.introducao.javacore.herancao.dominio.Endereco;
import academy.devdojo.maratonajava.introducao.javacore.herancao.dominio.Funcionario;
import academy.devdojo.maratonajava.introducao.javacore.herancao.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Getulio Vargas");
        endereco.setCep("9082741-080");

        Pessoa pessoa = new Pessoa("Yuri come bosta mole");
        pessoa.setCpf("10394387492420");
        pessoa.setEndero(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Gabriel");
        funcionario.setCpf("123456789");
        funcionario.setEndero(endereco);
        funcionario.setSalario(3000);
        funcionario.imprime(); 
    }
}
