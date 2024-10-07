package exercicio81a100.exercicio_99;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] vetor = new double[20];

        for (int i = 1; i <= 20; i++) {
            System.out.print("Informe o " + i + "º valor: ");
            double valor = sc.nextDouble();
            vetor[i - 1] = valor;
        }

        System.out.println("\nValores informados no vetor:");
        for (int i = 0; i < 20; i++) {
            System.out.print(vetor[i] + " ");
        }

        int contFimTroca = vetor.length - 1;
        for (int i = 0; i < 10; i++) {
            double inicioTroca = vetor[i];
            double fimTroca = vetor[contFimTroca];

            vetor[i] = fimTroca;
            vetor[contFimTroca] = inicioTroca;

            contFimTroca--;
        }

        System.out.println("\n\nValores trocados no vetor:");
        for (int i = 0; i < 20; i++) {
            System.out.print(vetor[i] + " ");
        }

        sc.close();
    }
}
