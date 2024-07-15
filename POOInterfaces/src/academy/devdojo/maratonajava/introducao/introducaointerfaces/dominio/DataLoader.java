package academy.devdojo.maratonajava.introducao.introducaointerfaces.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;

    void load(); // public abstract void load();

    // Se voce usar a sintaxe public default void ... isso permite a construção de um método sólido numa interfacie
    public default void checkPermission() {
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
