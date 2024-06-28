package academy.devdojo.maratonajava.javacore.introducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Matheus Araújo de Melo";
        estudante.idade = 21;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
    }
}
