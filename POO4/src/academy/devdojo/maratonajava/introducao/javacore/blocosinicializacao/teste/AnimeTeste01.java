package academy.devdojo.maratonajava.introducao.javacore.blocosinicializacao.teste;

import academy.devdojo.maratonajava.introducao.javacore.blocosinicializacao.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");
        for (int episodeos : anime.getEpisodios()) {
            System.out.println("Episodio foda numero "+ episodeos);
        }
    }

}
