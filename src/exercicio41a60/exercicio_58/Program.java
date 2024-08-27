package exercicio41a60.exercicio_58;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantidadeDeTabuadas = 20;

        while (quantidadeDeTabuadas != 0) {
            System.out.print("\nEscreva um valor para ser calculado na tabuada: ");
            int valor = sc.nextInt();

            boolean valorPositivo = false;

            while (!valorPositivo) {
                if (valor > 0) {
                    calcularTabuada(valor);
                    quantidadeDeTabuadas--;
                    valorPositivo = true;
                } else {
                    System.out.println("Por favor, insira um valor positivo.");
                }
            }
        }

        sc.close();
    }

    public static void calcularTabuada(int n) {
        int resultado;
        for (int i = 1; i <= n; i++) {
            resultado = i * n;
            System.out.println(i + " x " + n + " = " + resultado);
        }
    }
}
