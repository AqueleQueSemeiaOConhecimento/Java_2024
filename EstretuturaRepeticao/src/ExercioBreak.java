public class ExercioBreak {
// Descubra o  valor de um carro, descubra em quantas ele pode ser parcelado
// condica valorParcela >= 1000
public static void main(String[] args) {
    double valorTotal = 30000;
    for (int parcela = 1; parcela <= valorTotal; parcela++) {
         double valorParcela = valorTotal / parcela;
         if (valorParcela < 1000) {
            break;
         }
         System.out.println("Parcela "+ parcela+ " R$ "+valorParcela);
    }
}
}
