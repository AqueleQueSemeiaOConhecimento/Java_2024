package academy.devdojo.estruturacondicionalif.introducao;
/*
 * Taxas de impostos da caixa 1 para 2021 Rendimento tributável anual (bruto) 
 * Taxa total € 0 – 35.130 19,20% € 35.130 –68.508 37,10% € 68.508+ 49,50% 
 * Conteúdo1 Os impostos são altos na Holanda? 2 Como pago menos impostos 
 * na Holanda? 3 Quanto do salário é tributad...Apr 26, 2024
 */
public class Exercicio {

    public static void main(String[] args) {
    double meuSalarioAnual = 100000;
    double meuImposto = 0;
        
        if(meuSalarioAnual <= 35130) {
            meuImposto = meuSalarioAnual * (19.20/100);
        }   else if(meuSalarioAnual <= 68.508) {
            meuImposto = meuSalarioAnual * (37.10/100);
        }   else {
            meuImposto = meuSalarioAnual * (49.50/100);
        } 

        System.out.println("Meu imposto anual é de: "+meuImposto);
    }
}
