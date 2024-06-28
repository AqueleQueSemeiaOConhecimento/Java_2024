public class ExercicioEstruturaDeRepeticao {
    public static void main(String[] args) {
        // Imprima todos os numeros pares de 0 até 1000000

        /*
        int count = 0;
        while(count <= 1000000){
            if (count % 2 == 0) {
                System.out.println(count);
            }
            count++;
        }
        */

        for (int i = 0; i < 1000000; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
