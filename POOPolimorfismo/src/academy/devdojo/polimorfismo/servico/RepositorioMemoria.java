package academy.devdojo.polimorfismo.servico;

import academy.devdojo.polimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio{
    @Override
    public void salvar() {
        System.out.println("Salvando em memoria");
    }
}
