import java.util.Arrays;

public class Principal1 {
    public static void main(String[] args) {
        int[] numerosJogo1 = {25, 11, 8, 46, 37, 14};

        // COPIAR UM ARRAY EXISTENTE:
        int[] numerosJogo2 = Arrays.copyOf(numerosJogo1, numerosJogo1.length);
        int[] numerosJogo3 = Arrays.copyOf(numerosJogo1, 3);
        int[] numerosJogo4 = Arrays.copyOf(numerosJogo1, numerosJogo1.length+1);

        System.out.println(Arrays.toString(numerosJogo2));
        System.out.println(Arrays.toString(numerosJogo3));
        System.out.println(Arrays.toString(numerosJogo4));
    }
}
