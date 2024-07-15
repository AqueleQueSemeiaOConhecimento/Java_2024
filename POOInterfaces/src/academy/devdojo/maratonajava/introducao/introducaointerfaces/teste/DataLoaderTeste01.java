package academy.devdojo.maratonajava.introducao.introducaointerfaces.teste;

import academy.devdojo.maratonajava.introducao.introducaointerfaces.dominio.DataLoader;
import academy.devdojo.maratonajava.introducao.introducaointerfaces.dominio.DatabaseLoader;
import academy.devdojo.maratonajava.introducao.introducaointerfaces.dominio.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();
        
        DataLoader.retrieveMaxDataSize();
        FileLoader.retrieveMaxDataSize();
    }
}
