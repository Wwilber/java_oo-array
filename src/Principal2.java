public class Principal2 {
    public static void main(String[] args) {
        Turma turmaB = new Turma();
        turmaB.identificacao = "Maternal B";
        turmaB.nomeProfessora = "Maria";

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Maria";
        aluno1.idade = 30;

        Aluno aluno2 = new Aluno();
        aluno1.nome = "Laura";
        aluno1.idade = 4;

        turmaB.adicionarAluno(aluno1);

        turmaB.imprimirListaAlunos();


    }
}
