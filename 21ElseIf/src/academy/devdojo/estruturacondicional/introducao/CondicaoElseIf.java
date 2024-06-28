package academy.devdojo.estruturacondicional.introducao;

public class CondicaoElseIf {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Você pode comprar bebida");
        } else {
            System.out.println("Você não pode comprar bebida");
        }
    }
}
