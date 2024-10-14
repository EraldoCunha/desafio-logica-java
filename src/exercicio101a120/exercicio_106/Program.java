package exercicio101a120.exercicio_106;

public class Program {

    public static void main(String[] args) {

        int[] vetorX = new int[10];

        int quantidadePrimos = 0;
        int numero = 100;

        while (quantidadePrimos < 10) {
            if (ehPrimo(numero)) {
                vetorX[quantidadePrimos] = numero;
                quantidadePrimos++;
            }
            numero++;
        }

        System.out.println();
        for(int  n : vetorX){
            System.out.print(n + " ");
        }

    }

    public static boolean ehPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
