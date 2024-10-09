package exercicio101a120.exercicio_101;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];
        int[] vetorPar = new int[5];
        int[] vetorImpar = new int[5];

        for (int i = 1; i <= 10; i++) {
            System.out.print("Informe o " + i + "º valor: ");
            int valor = sc.nextInt();
            vetor[i - 1] = valor;
        }

        System.out.println("\nValores informados no vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }

        int contPar = 0;
        int contImpar = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                vetorPar[contPar] = vetor[i];
                contPar++;
            } else {
                vetorImpar[contImpar] = vetor[i];
                contImpar++;
            }
        }


        System.out.println("\nVetor das posições pares: ");
        for (Integer v : vetorPar) {
            System.out.print(v + " ");
        }

        System.out.println("\nVetor das posições ímpares: ");
        for (Integer v : vetorImpar) {
            System.out.print(v + " ");
        }

        sc.close();
    }
}
