package exercicio121a123.exercicio_121;

public class Program {

    public static void main(String[] args) {

        int[] numeros = {3, 8, 12, 15, 16};
        encontrarParesPrimosEntreSi(numeros);

    }

    public static int calcularMDC(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void encontrarParesPrimosEntreSi(int[] numeros) {
        System.out.println("Pares de números primos entre si:");

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (calcularMDC(numeros[i], numeros[j]) == 1) {
                    System.out.println("(" + numeros[i] + ", " + numeros[j] + ")");
                }
            }
        }
    }
}
