package exercicio81a100.exercicio_97;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetorMultiplicado = new int[10];

        System.out.println("Vetor 1:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número para a posição " + (i + 1) + ": ");
            vetor1[i] = sc.nextInt();
        }

        System.out.println("Vetor 2:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número para a posição " + (i + 1) + ": ");
            vetor2[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            vetorMultiplicado [i]= vetor1[i] * vetor2 [i];
        }

        System.out.println("Multiplicação dos vetores :");
        for(int v : vetorMultiplicado){
            System.out.print(v + " ");
        }

        sc.close();
    }
}
