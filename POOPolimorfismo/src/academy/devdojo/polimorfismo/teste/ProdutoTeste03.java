package academy.devdojo.polimorfismo.teste;

import academy.devdojo.polimorfismo.dominio.Computador;
import academy.devdojo.polimorfismo.dominio.Produto;
import academy.devdojo.polimorfismo.dominio.Tomate;
import academy.devdojo.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9500", 4000);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2021");

        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(produto);
    }
}
