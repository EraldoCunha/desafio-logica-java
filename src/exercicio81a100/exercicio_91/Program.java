package exercicio81a100.exercicio_91;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x, y, potencia;

        while (true) {
            System.out.print("Informe o valor de X (inteiro e positivo): ");
            x = sc.nextInt();
            System.out.print("Informe o valor de Y (inteiro e positivo): ");
            y = sc.nextInt();

            if (x > 0 && y > 0) {
                potencia = (int) Math.pow(x, y);
                break;
            } else {
                System.out.println("Os valores de X e Y devem ser inteiros e positivos. Tente novamente.");
            }
        }


        System.out.printf("Potência = %d%n", potencia);

        sc.close();
    }
}
