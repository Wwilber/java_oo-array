import java.util.Arrays;

public class Principal_remover {
    public static void main(String[] args) {
        int[] numerosJogoAtual = {25, 11, 8, 46, 37, 14, 55};

        // REMOVER UM ELEMENTO DE UM  ARRAY - DUPLICA COM MENOS POSIÇÕES:
        int[] numeroNovoJogo =  new int[numerosJogoAtual.length-1];

        int indiceExclusao = 2;


        System.arraycopy(numerosJogoAtual, 0, numeroNovoJogo, 0, indiceExclusao);
        System.arraycopy(numerosJogoAtual, indiceExclusao+1,numeroNovoJogo, indiceExclusao, numeroNovoJogo.length-indiceExclusao);
        // [25, 11, 8, 46, 37, 14, 55]
        //[0, 0, 0, 0, 0, 0]



        System.out.println(Arrays.toString(numerosJogoAtual));
        System.out.println(Arrays.toString(numeroNovoJogo));
    }
}
