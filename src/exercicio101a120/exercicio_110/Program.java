package exercicio101a120.exercicio_110;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] vetor = new double[50];

        for (int i = 0; i < vetor.length; i++) {
            while (true) {
                System.out.print("Informe um valor positivo para a " + (i + 1) + "ª posição: ");
                double valor = sc.nextDouble();
                if (valor > 0) {
                    vetor[i] = valor;
                    break;
                }
            }
        }

        int codigo;

        do {
            System.out.print("Digite 1 para mostrar o vetor na ordem digitada;" +
                    "\nDigite 2 para mostrar o vetor na ordem inversa;" +
                    "\nDigite 0 para encerrar: ");
            codigo = sc.nextInt();


            switch (codigo) {
                case (0):
                    System.out.println("Encerrando...");
                    break;
                case (1):
                    System.out.println("Vetor na ordem digitada:");
                    for (double num : vetor) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;
                case (2):
                    System.out.println("Vetor na ordem inversa:");
                    for (int i = vetor.length - 1; i >= 0; i--) {
                        System.out.print(vetor[i] + " ");
                    }
                    System.out.println();
                    break;
                default:
                    System.out.println("Código inválido...\n\n");
                    System.out.println();
            }
        } while (codigo != 0);

        sc.close();
        System.out.println("Programa encerrado com sucesso.");
    }
}
