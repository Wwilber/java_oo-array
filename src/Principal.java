import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {

        int[] notas = {8, 5, 4, 9, 10};

        // TRNASFORMAR ARRAY EM STRING: classe utilitária para trabalhar com Arrays: possui métodos estáticos:

        String notasEmString = Arrays.toString(notas);


        System.out.println(notasEmString);


    }
}
