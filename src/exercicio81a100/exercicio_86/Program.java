package exercicio81a100.exercicio_86;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<List<Double>> valores = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {

            List<Double> valoresSeparados = new ArrayList<>();
            System.out.println("Grupo de valores nº" + i);

            for (int j = 1; j <= 4; j++) {
                System.out.print("Informe o " + j + "º valor: ");
                double valor = sc.nextDouble();
                valoresSeparados.add(valor);
            }
            valores.add(valoresSeparados);
        }

        int contador = 1;
        for (List<Double> lista : valores) {
            System.out.println("Valores inseridos no grupo " + contador);
            for (Double v : lista) {
                System.out.println(v);
            }
            System.out.println();
            contador++;
        }

        contador = 1;
        for (List<Double> lista : valores) {
            System.out.println("Valores ordenados em forma descendente no grupo " + contador);
            lista.sort(Comparator.reverseOrder());
            for (Double v : lista) {
                System.out.println(v);
            }
            System.out.println();
            contador++;
        }

        sc.close();
    }
}
