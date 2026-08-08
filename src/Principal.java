import java.util.Arrays;
import java.util.Comparator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {

        // ORDENAMENTO DO PRÓPRIO ARRAY (notas):
        int[] notas = {8, 5, 4, 9, 10};
        Arrays.sort(notas);
        System.out.println(Arrays.toString(notas));

        // REVERTER O ORDENAMENTO DO ARRAY (notas2:
        Integer[] notas2 = {28, 17, 12, 29, 44};
        Arrays.sort(notas2, Comparator.reverseOrder());
        System.out.println(Arrays.toString(notas2));

    }
}
