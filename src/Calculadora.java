public class Calculadora {

    static double calcularMedia(int[] numeros) {
        // FORMA 01:
        int total = 0;

        for (int i = 0; i < numeros.length; i++) {
            total += numeros[i];
        }
        double media = (double) total / numeros.length;
        return media;
    }
    // FORMA 02:
    // enhanced for(loop melhorado) = a partir do java 5 - for simplificado para percorrer
    //  o array e não precisar do indice:

    // usando o postfix: numeros.for:
    // int j = 0;
//        for (int numero : numeros) {
//            total += numero;
//        j++
//        }


}
