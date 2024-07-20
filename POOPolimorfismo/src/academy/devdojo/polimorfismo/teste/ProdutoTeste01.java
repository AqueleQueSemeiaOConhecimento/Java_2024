package academy.devdojo.polimorfismo.teste;

import academy.devdojo.polimorfismo.dominio.Computador;
import academy.devdojo.polimorfismo.dominio.Televisao;
import academy.devdojo.polimorfismo.dominio.Tomate;
import academy.devdojo.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("PC Fodão", 10000); 
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        Televisao tv = new Televisao("Samsung 32\" ", 2000);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-------------");
        CalculadoraImposto.calcularImposto(tv);

    }
}
