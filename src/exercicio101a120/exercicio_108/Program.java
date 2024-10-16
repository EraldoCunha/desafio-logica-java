package exercicio101a120.exercicio_108;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetorK = new int[15];
        int[] vetorP = new int[15];

        for(int i = 0; i < 15 ; i++){
            System.out.print("Informe o " + (i + 1) + "º valor: ");
            vetorK[i] = sc.nextInt();
        }

        System.out.print("Vetor K: ");
        for (int num : vetorK) {
            System.out.print(num + " ");
        }
        System.out.println();

        int contadorPrimos = 0;
        for(int i = 0; i < 15 ; i++){
            if(ehPrimo(vetorK[i])){
                vetorP[contadorPrimos] = vetorK[i];
                contadorPrimos++;
            }
        }

        System.out.print("Vetor P (primos): ");
        for (int i = 0; i < contadorPrimos; i++) {
            System.out.print(vetorP[i] + " ");
        }

        sc.close();
    }

    public static boolean ehPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
