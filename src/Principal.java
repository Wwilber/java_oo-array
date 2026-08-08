//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {

        int[] notas = {8, 5, 4, 9, 10};

        double resultado = Calculadora.calcularMedia(notas);

        System.out.printf("Resultado: %.2f%n", resultado);


    }
}
