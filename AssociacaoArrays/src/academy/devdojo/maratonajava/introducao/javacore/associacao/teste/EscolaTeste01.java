package academy.devdojo.maratonajava.introducao.javacore.associacao.teste;

import academy.devdojo.maratonajava.introducao.javacore.associacao.dominio.Escola;
import academy.devdojo.maratonajava.introducao.javacore.associacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Matheus Araujo");
        Professor professor2 = new Professor("Raphael Azambuja");
        Professor professor3 = new Professor("Beatriz Vieira");
        Professor[] professores = {professor1, professor2, professor3};
        Escola escola = new Escola("CEDUP", professores);
        escola.imprime();
    }
}
