package academy.devdojo.estruturacondicionalif.introducao;

public class EstruturaCondicional3 {
    public static void main(String[] args) {
        float salario = 3000.00F;
        String mensagemDoar = "Eu vou doar 500 pro mano DevDojo";
        String mensagemNaoDoar = "Eu não vou dor um centavo pra esse miseravel";
        String resultado = (salario >= 3000) ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
