package academy.devdojo.tiposprimitivos.introducao;
/*
Prática

Crie variáveis para os cambos descritos abaixos entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no enderenço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
*/

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Matheus Araújo de Melo";
        String endereco = "Rua De Mentira Que Não Existe, São Paulo, SP";
        float salario = 3250.99F;
        String dataRecebimentoSalario = "11/12/2024";
        String relatorio = "Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário de "+salario+", na data de "+dataRecebimentoSalario;

        System.out.println(relatorio);
    }
}
