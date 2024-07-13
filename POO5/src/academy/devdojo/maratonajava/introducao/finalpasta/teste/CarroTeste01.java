package academy.devdojo.maratonajava.introducao.finalpasta.teste;

import academy.devdojo.maratonajava.introducao.finalpasta.dominio.Carro;
import academy.devdojo.maratonajava.introducao.finalpasta.dominio.Comprador;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(carro.getVelocidadeLimite());

        Comprador comprador2 = new Comprador();
        carro.COMPRADOR.setNome("Arthur");

        System.out.println(carro.COMPRADOR.getNome() );
    }
}
