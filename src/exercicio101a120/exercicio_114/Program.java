package exercicio101a120.exercicio_114;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[50];
        int[] vetorB = new int[50];
        int somatorio = 0;

        System.out.println("Valores do primeiro vetor:");
        for(int i = 0; i < 50 ; i++){
            System.out.print("Informe o " + (i + 1) + "º valor: ");
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Valores do segundo vetor:");
        for(int i = 0; i < 50 ; i++){
            System.out.print("Informe o " + (i + 1) + "º valor: ");
            vetorB[i] = sc.nextInt();
        }

        for (int i = 0; i < 50; i++) {
            somatorio += vetorA[i] - vetorB[49 - i];
        }

        System.out.printf("A soma das subtrações é: %d\n", somatorio);

        sc.close();
    }
}
