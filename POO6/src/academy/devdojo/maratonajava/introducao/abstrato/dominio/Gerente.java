package academy.devdojo.maratonajava.introducao.abstrato.dominio;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Gerente: " + nome + " salario: " + salario;
    }

    @Override
    public void calculaBonus() {
        this.salario = this.salario * 1.05;
    }

    
    
}
