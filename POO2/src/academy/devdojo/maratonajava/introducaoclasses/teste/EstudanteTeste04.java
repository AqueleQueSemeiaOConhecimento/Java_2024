package academy.devdojo.maratonajava.introducaoclasses.teste;

import academy.devdojo.maratonajava.introducaoclasses.dominio.Estudante;
import academy.devdojo.maratonajava.introducaoclasses.dominio.ImpressoraEstudante;

public class EstudanteTeste04 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante1.nome = "Midoriya";
        estudante1.idade = 15;
        estudante1.sexo = 'M';

        estudante2.nome = "Kurumi Tokisaki";
        estudante2.idade = 20;
        estudante2.sexo = 'F';

        impressoraEstudante.imprime(estudante1);
        impressoraEstudante.imprime(estudante2);

    }
}
