package academy.devdojo.maratonajava.javacore.introducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fusca";
        carro1.modelo = "Retro";
        carro1.ano = 1969;

        carro2.nome = "Mercedes";
        carro2.modelo = "Turbo";
        carro2.ano = 2017;
    }
}
