package academy.devdojo.maratonajava.introducao.introducaointerfaces.dominio;

public class FileLoader implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }
    
    @Override
    public void remove() {
        System.out.println("Deletando dados do arquivo");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize na interface do arquivo");
    }
}
