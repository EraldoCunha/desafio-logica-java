package exercicio101a120.exercicio_113;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] vetor = new double[80];

        for(int i = 0; i < vetor.length; i++){
            System.out.print("Informe o " + i + "º valor: ");
            double valor = sc.nextDouble();
            vetor[i] = valor;
        }

        double menor = vetor[0];
        int posicao = 0;

        for(int i = 1; i < vetor.length; i++){
            if(vetor[i] < menor){
                menor = vetor[i];
                posicao = i;
            }
        }

        System.out.println("O menor valor é " + menor + " e está na posição " + posicao);

        sc.close();
    }
}
