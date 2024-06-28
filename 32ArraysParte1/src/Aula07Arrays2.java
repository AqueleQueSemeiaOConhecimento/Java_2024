public class Aula07Arrays2 {
    public static void main(String[] args) {
        /*
         * Em um array:
         * 
         * byte, short, int, long, float, double 0
         * chat ' '
         * boolean false
         * String null
         */
        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Gohan";
        nomes[2] = "Goten";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
