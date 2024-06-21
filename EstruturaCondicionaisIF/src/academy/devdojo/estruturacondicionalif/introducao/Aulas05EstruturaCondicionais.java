package academy.devdojo.estruturacondicionalif.introducao;

public class Aulas05EstruturaCondicionais {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if(isAutorizadoComprarBebida) {
            System.out.println("Pode comprar bebida alcolica");
        }
        
        if(!isAutorizadoComprarBebida) {
            System.out.println("Não é permitido a compra de bebida alcolica");
        }

    }
}
