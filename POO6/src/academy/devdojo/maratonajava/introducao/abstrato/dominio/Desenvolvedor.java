package academy.devdojo.maratonajava.introducao.abstrato.dominio;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Desenvolvedor: " + nome + " salario: " + salario;
    }


    public void calculaBonus() {
        this.salario = this.salario * 1.1;
    }
    
}
