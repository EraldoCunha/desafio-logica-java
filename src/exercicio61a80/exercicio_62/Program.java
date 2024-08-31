package exercicio61a80.exercicio_62;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Valor> valores = new ArrayList<>();
        int contador = 0;

        while (true) {
            System.out.print("Informe um valor (ou digite um número negativo para sair): ");
            double input = sc.nextDouble();
            if (input < 0) {
                break;
            }
            valores.add(new Valor(input));
            contador++;

            if (contador % 20 == 1) {
                System.out.printf("\n| %-10s | %-10s | %-10s | %-10s |\n", "Numero", "Quadrado", "Cubo", "Raiz Quadrada");
                System.out.println("--------------------------------------------------------");
            }

            Valor v = valores.get(contador - 1);
            System.out.printf("| %-10.2f | %-10.2f | %-10.2f | %-10.2f |\n", v.getNumero(), v.getQuadrado(), v.getCubo(), v.getRaizQuadrada());
        }

        sc.close();
    }
}
