package academy.devdojo.polimorfismo.teste;

import academy.devdojo.polimorfismo.repositorio.Repositorio;
import academy.devdojo.polimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}
