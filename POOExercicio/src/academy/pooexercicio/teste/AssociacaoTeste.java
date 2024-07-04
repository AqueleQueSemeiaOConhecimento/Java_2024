package academy.pooexercicio.teste;

import academy.pooexercicio.dominio.Aluno;
import academy.pooexercicio.dominio.Local;
import academy.pooexercicio.dominio.Professor;
import academy.pooexercicio.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras");
        Aluno aluno = new Aluno("Matheus Araujo de Melo", 21);
        Professor professor = new Professor("Felipe Souza", "SQL");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Tanuki", alunosParaSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
