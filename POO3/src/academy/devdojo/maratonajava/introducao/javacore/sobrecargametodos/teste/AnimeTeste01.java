package academy.devdojo.maratonajava.introducao.javacore.sobrecargametodos.teste;

import academy.devdojo.maratonajava.introducao.javacore.sobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Tokyo Ghoul", "Tv", 12, "Ação");
        anime.imprime();
    }
}
