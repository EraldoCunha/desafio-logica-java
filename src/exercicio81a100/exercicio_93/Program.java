package exercicio81a100.exercicio_93;

public class Program {

    public static void main(String[] args) {

        int quantidadePrimos = 0;

        int numero = 120;

        while (quantidadePrimos < 20) {
            if (ehPrimo(numero)) {
                System.out.println(numero);
                quantidadePrimos++;
            }
            numero++;
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
