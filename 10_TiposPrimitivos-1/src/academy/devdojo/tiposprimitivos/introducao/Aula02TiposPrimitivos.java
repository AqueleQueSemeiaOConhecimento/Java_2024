package academy.devdojo.tiposprimitivos.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // Tipos primitivos são os tipos de dados
        // int, double, float, char, byte, short, long, boolean
        int idade = 10;
        long numeroGrande = 1000000L;
        double salarioDouble = 2000.0D;
        float salarioFloat = 2500.0F;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';

        
        // String não é tipo primitivo, é uma classe 
        String nome = "Matheus Araújo de Melo";

        System.out.println("A idade é "+idade+" anos");
        System.out.println("char "+caractere);
        System.out.println("numero grande "+numeroGrande);
        System.out.println("Meu nome é "+nome);
    }
}
