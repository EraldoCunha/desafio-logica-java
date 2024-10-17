package exercicio101a120.exercicio_109;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] vetorX = new int[20];
        Set<Integer> valoresDistintos = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            System.out.print("Informe o " + (i + 1) + "º valor: ");
            vetorX[i] = sc.nextInt();
        }

        System.out.print("Vetor X: ");
        for (int num : vetorX) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int i = 0; i < 20; i++) {
            int valor = vetorX[i];

            if (!valoresDistintos.contains(valor)) {
                int contador = 0;

                for (int j = 0; j < 20; j++) {
                    if (valor == vetorX[j]) {
                        contador++;
                    }
                }

                valoresDistintos.add(valor);

                System.out.println("O valor " + valor + " apareceu " + contador + " vez(es).");
            }
        }

        sc.close();
    }
}
