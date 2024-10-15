package exercicio101a120.exercicio_107;

import java.util.Arrays;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetor3 = new int[20];

        System.out.println("Valores do primeiro vetor:");
        for(int i = 0; i < 10 ; i++){
            System.out.print("Informe o " + (i + 1) + "º valor: ");
            vetor1[i] = sc.nextInt();
        }

        System.out.println("Valores do segundo vetor:");
        for(int i = 0; i < 10 ; i++){
            System.out.print("Informe o " + (i + 1) + "º valor: ");
            vetor2[i] = sc.nextInt();
        }

        System.arraycopy(vetor1, 0, vetor3, 0, vetor1.length);

        System.arraycopy(vetor2, 0, vetor3, vetor1.length, vetor2.length);

        Arrays.sort(vetor3);

        System.out.println("Vetor resultante:");
        for (int num : vetor3) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
