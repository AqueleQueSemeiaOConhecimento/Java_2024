package academy.devdojo.operadores.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        // o resultado de uma operação entre 2 numeros inteiros 
        // so pode ser um numero inteiro!
        System.out.println(numero01 + numero02);

        // % (resto) 
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println("isDezMaiorQueVinte "+ isDezMaiorQueVinte); 
        System.out.println("isDezMenorQueVinte "+ isDezMenorQueVinte);

        // Operadores lógicos, &&(AND), ||(OR), !(NOT)
        // &&
        int idade = 25;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+ isDentroDaLeiMenorQueTrinta);

        // ||
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente  >= valorPlaystation || valorTotalContaPoupanca >= valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+ isPlaystationCincoCompravel);
    }
}
