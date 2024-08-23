package exercicio41a60.exercicio_54;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double somatorio = 0;
        int contador = 0;
        boolean codigoZero = false;

        do {
            System.out.print("\nDigite um número: ");
            double numero = sc.nextDouble();
            if (numero == 0) {
                codigoZero = true;
            } else {

                if (numero % 2 == 0) {
                    somatorio += numero;
                    contador++;
                }
            }
        } while (!codigoZero);

        if (contador != 0) {
            double mediaDosPares = somatorio / contador;
            System.out.printf("%nA média dos números pares é de %.2f", mediaDosPares);
        } else {
            System.out.print("\nNão foi possível calcular a média dos números pares pois nenhum numero par foi informado.");
        }

        sc.close();
    }
}
