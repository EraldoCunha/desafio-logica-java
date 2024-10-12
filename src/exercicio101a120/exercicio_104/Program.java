package exercicio101a120.exercicio_104;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer[] vetor = new Integer[12];
        Integer[] vetor2 = new Integer[12];

        for (int i = 0; i < 12; i++) {
            System.out.print("Informe o " + (i + 1) + " valor: ");
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < 12; i++) {
            if (vetor[i] == 0) {
                vetor2[i] = 1;
            } else {
                vetor2[i] = vetor[i];
            }
        }

        System.out.println("\nValores informados no primeiro vetor:");
        for (Integer v : vetor) {
            System.out.print(v + " ");
        }

        System.out.println("\nValores do segundo vetor:");
        for (Integer v : vetor2) {
            System.out.print(v + " ");
        }

        sc.close();
    }
}
