package exercicio101a120.exercicio_117;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o tamanho da matriz quadrada: ");
        int tamanho = sc.nextInt();
        int[][] matriz = new int[tamanho][tamanho];

        System.out.println("Digite os valores da matriz:");
        for(int i = 0; i < tamanho; i++){
            for(int j = 0; j < tamanho; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println(verificarSimetria(matriz));

        sc.close();
    }

    public static String verificarSimetria(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = i + 1; j < matriz.length; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return "A matriz não é simétrica!";
                }
            }
        }
        return "A matriz é simétrica!";
    }
}
