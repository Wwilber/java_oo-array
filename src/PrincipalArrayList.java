import java.util.ArrayList;

public class PrincipalArrayList {
    public static void main(String[] args) {

//        String[] alunos = new String[2];
//        alunos[0] = "João";
//        alunos[1] = "Maria";

        ArrayList<String> alunos = new ArrayList<>();
        alunos.add("João");
        alunos.add("Maria");

        for (int i = 0; i < alunos.size(); i++) {
            String aluno = alunos.get(i);
            System.out.println(aluno);

        }
    }


}
