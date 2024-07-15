package academy.devdojo.maratonajava.introducao.abstrato.teste;

import academy.devdojo.maratonajava.introducao.abstrato.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.introducao.abstrato.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Luffy", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("matheus", 7000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }


}
