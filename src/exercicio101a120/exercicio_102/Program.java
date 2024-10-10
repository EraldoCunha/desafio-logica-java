package exercicio101a120.exercicio_102;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[7];

        for(int i = 0; i < 7; i++){
            System.out.print("Informe um valor inteiro: ");
            int valor = sc.nextInt();
            vetor[i] = valor;
        }

        int posicao = 0;
        int menorValor = vetor[0];

        for(int i = 0; i < 7; i++){
            if(vetor[i] < menorValor){
                menorValor = vetor[i];
                posicao = i;
            }
        }

        System.out.println("\nO menor valor é " + menorValor + " e está na posição " + posicao + " no vetor.");

        sc.close();
    }
}
