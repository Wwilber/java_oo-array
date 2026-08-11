import java.util.ArrayList;
import java.util.Arrays;

public class Turma {
    String identificacao;
    String nomeProfessora;
   //  Aluno[] alunos = new Aluno[0];
   ArrayList<Aluno> alunos = new ArrayList<>();

    // PODERIA JÁ INSTANCIAR O ARRAY DE ALUNOS:
    // Aluno[] alunos = new Aluno[3];

    void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
        //        this.alunos = Arrays.copyOf(this.alunos, this.alunos.length+1);
        //        alunos[alunos.length-1] = aluno;
    }

    void removerAluno(int indice) {
        alunos.remove(indice);

//        Aluno[] novosAlunos = new Aluno[alunos.length - 1];
//
//        System.arraycopy(alunos, 0, novosAlunos, 0, indice);
//        System.arraycopy(alunos,  indice + 1, novosAlunos, indice, novosAlunos.length - indice);
//
//        alunos = novosAlunos;

    }

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