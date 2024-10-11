package exercicio101a120.exercicio_103;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer[] vetor = new Integer[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o " + (i + 1) + " valor: ");
            vetor[i] = sc.nextInt();
        }

        Arrays.sort(vetor, Collections.reverseOrder());

        System.out.println("\nValores ordenados em ordem decrescente: ");
        for (Integer v : vetor) {
            System.out.print(v + " ");
        }

        sc.close();
    }
}
