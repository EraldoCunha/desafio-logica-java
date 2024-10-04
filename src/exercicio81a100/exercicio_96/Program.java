package exercicio81a100.exercicio_96;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] elementos = new int[20];

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o número para a posição " + (i + 1) + ": ");
            elementos[i] = sc.nextInt();
        }

        int contElementosPares = 0;
        for (int elemento : elementos) {
            if (elemento % 2 == 0) {
                contElementosPares++;
            }
        }

        System.out.println("O vetor tem " + contElementosPares + " elementos pares.");

        sc.close();
    }
}