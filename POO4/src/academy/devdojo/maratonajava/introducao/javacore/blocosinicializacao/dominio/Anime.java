package academy.devdojo.maratonajava.introducao.javacore.blocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    // 1 - Alocado espaço em memória pro objeto
    // 2 - Cada atributo classe é criado e inicializado com valores default ou o quer for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Contrutor é executado
    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }
    public Anime(String nome){
        this.nome = nome;
    }

    public Anime(){

        for (int i : episodios) {
            System.out.println("Episodeo "+i);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }

    
}
