public class EstruturaRepeticaContinue {
    public static void main(String[] args) {
         double valorTotal = 30000;

         for (double parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;  

            if(valorParcela < 1000) {
                continue;
            }

            System.out.println("Parcela "+parcela + " R$ "+ valorParcela);
         }
    }
}
