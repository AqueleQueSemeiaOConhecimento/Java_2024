package academy.devdojo.maratonajava.introducao.javacore.associacao.teste;

import academy.devdojo.maratonajava.introducao.javacore.associacao.dominio.Jogador;
import academy.devdojo.maratonajava.introducao.javacore.associacao.dominio.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Brasil");

        jogador.setTime(time);
        jogador2.setTime(time);
        Jogador[] jogadores = {jogador, jogador2};
        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador.imprime();
        jogador2.imprime();

        System.out.println("--- Time ---");
        time.imprime();
    }
}
