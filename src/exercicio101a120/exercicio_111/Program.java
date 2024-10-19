package exercicio101a120.exercicio_111;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] vetorA = new double[100];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Informe um valor para a " + (i + 1) + "ª posição: ");
            vetorA[i] = sc.nextDouble();
        }

        int countPositivos = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] > 0) {
                countPositivos++;
            }
        }

        double[] vetorB = new double[countPositivos];

        int indexB = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] > 0) {
                vetorB[indexB] = vetorA[i];
                indexB++;
            }
        }

        System.out.print("Vetor B (valores compactados): ");
        for (double valor : vetorB) {
            System.out.print(valor + " ");
        }

        sc.close();
    }
}
