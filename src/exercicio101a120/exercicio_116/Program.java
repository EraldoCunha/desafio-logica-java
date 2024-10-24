package exercicio101a120.exercicio_116;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int[][] transposta = new int[5][5];

        System.out.println("Digite os valores da matriz 5x5:");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                transposta[j][i] = matriz[i][j];
            }
        }

        System.out.println("Matriz transposta:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
