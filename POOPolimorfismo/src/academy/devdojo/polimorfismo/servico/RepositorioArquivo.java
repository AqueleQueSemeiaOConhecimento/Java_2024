package academy.devdojo.polimorfismo.servico;

import academy.devdojo.polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio{

    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
    
}
