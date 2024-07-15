package academy.devdojo.maratonajava.introducao.introducaointerfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando dados...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }
    
}
