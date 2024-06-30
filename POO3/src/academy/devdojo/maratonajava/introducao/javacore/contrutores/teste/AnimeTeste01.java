package academy.devdojo.maratonajava.introducao.javacore.contrutores.teste;

import academy.devdojo.maratonajava.introducao.javacore.contrutores.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Tokyo Ghoul", "Tv", 12, "Ação", "Produção Matheus");
        anime.imprime();
    }
}
