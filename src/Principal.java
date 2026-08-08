public class Principal {
    public static void main(String[] args) {
        Turma turmaB = new Turma();

        turmaB.identificacao = "Maternal B";
        turmaB.nomeProfessora = "Maria";
        turmaB.alunos = new Aluno[3];

        turmaB.alunos[0] = new Aluno();
        turmaB.alunos[0].nome = "João";
        turmaB.alunos[0].idade = 20;

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Maria";
        aluno1.idade = 30;

        turmaB.alunos[1] = aluno1;
        turmaB.imprimirListaAlunos();

//        for (int i = 0; i < turmaB.alunos.length; i++) {
//            Aluno aluno = turmaB.alunos[i];
//
//            if (aluno != null) {
//                System.out.printf("%d - %s (%d anos) %n",
//                        i, aluno.nome, aluno.idade);
//            } else {
//                System.out.printf(" %d - vago %n", i);
//            }
    }


}

