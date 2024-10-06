package exercicio81a100.exercicio_98;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetorPar = new int[10];
        int[] vetorImpar = new int[10];
        int indicePar = 0;
        int indiceImpar = 0;

        for (int i = 1; i <= 30; i++) {
            System.out.print("Informe o " + i + "º valor: ");
            int valor = sc.nextInt();

            if (valor % 2 == 0) {
                if (indicePar < 10) {
                    vetorPar[indicePar] = valor;
                    indicePar++;
                } else {
                    System.out.println("O vetor de números pares está cheio!");
                    System.out.println("Valores pares: ");
                    for (int j = 0; j < 10; j++) {
                        System.out.print(vetorPar[j] + " ");
                    }
                    System.out.println();
                    indicePar = 0;
                    vetorPar[indicePar] = valor;
                    indicePar++;
                }
            } else {
                if (indiceImpar < 10) {
                    vetorImpar[indiceImpar] = valor;
                    indiceImpar++;
                } else {
                    System.out.println("O vetor de números ímpares está cheio!");
                    System.out.println("Valores ímpares: ");
                    for (int j = 0; j < 10; j++) {
                        System.out.print(vetorImpar[j] + " ");
                    }
                    System.out.println();
                    indiceImpar = 0;
                    vetorImpar[indiceImpar] = valor;
                    indiceImpar++;
                }
            }
        }

        System.out.println("Valores pares finais:");
        for (int i = 0; i < indicePar; i++) {
            System.out.print(vetorPar[i] + " ");
        }
        System.out.println();

        System.out.println("Valores ímpares finais:");
        for (int i = 0; i < indiceImpar; i++) {
            System.out.print(vetorImpar[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
