package exercicio81a100.exercicio_81;

import java.math.BigInteger;

public class Program {

    public static void main(String[] args) {

        BigInteger produto = BigInteger.ONE;

        for (int i = 92; i <= 1478; i++) {
            boolean primo = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                produto = produto.multiply(BigInteger.valueOf(i));
            }
        }

        System.out.println("O produto dos números primos entre 92 e 1478 é: " + produto);

    }
}
