public class Turma {
    String identificacao;
    String nomeProfessora;
    Aluno[] alunos;

    // PODERIA JÁ INSTANCIAR O ARRAY DE ALUNOS:
    // Aluno[] alunos = new Aluno[3];

    void imprimirListaAlunos() {
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                System.out.printf("%s (%d anos) %n",
                        aluno.nome, aluno.idade);
            } else {
                System.out.printf(" vago %n");
            }
        }
    }

}