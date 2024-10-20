package exercicio101a120.exercicio_112;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[500];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe um valor para a " + (i + 1) + "ª posição: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("\nVetor antes da divisão:");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }

        int maior = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        System.out.println("\n\nO maior valor do vetor é " + maior);

        double[] vetorDividido = new double[500];

        System.out.println("\nVetor após a divisão por " + maior + ":");
        for (int i = 0; i < vetor.length; i++) {
            vetorDividido[i] = (double) vetor[i] / maior;
        }

        for (double valor : vetorDividido) {
            System.out.printf("%.2f ", valor);
        }

        sc.close();
    }
}