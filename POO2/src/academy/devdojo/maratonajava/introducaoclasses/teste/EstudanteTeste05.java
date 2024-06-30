package academy.devdojo.maratonajava.introducaoclasses.teste;

import academy.devdojo.maratonajava.introducaoclasses.dominio.Estudante;

public class EstudanteTeste05 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Matheus Araújo de Melo";
        estudante.idade = 21;
        estudante.sexo = 'M';

        estudante.imprime();
    }
}
