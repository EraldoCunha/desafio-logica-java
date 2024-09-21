package exercicio81a100.exercicio_83;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores serão lidos? ");
        int n = sc.nextInt();
        System.out.println();

        List<Integer> valores = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            boolean valorPositivo = false;

            while (!valorPositivo) {
                System.out.print("Escreva o " + i + "º valor: ");
                int m = sc.nextInt();

                if (m > 0) {
                    valores.add(m);
                    valorPositivo = true;
                } else {
                    System.out.println("Por favor, insira um valor positivo maior que zero.");
                }
            }
        }
        System.out.printf("\n| %-10s | %-10s | %-10s\n", "Valor", "Somatório", "Fatorial");
        System.out.println("----------------------------");

        for (Integer v : valores) {
            int fatorial = calcularFatorial(v);
            int somatorio = calcularSomatorio(v);
            System.out.printf("| %-10d | %-10d | %-10d\n", v, somatorio, fatorial);
        }

        sc.close();
    }

    public static Integer calcularSomatorio(int numero) {
        int somatorio = 0;

        for (int i = 1; i <= numero; i++) {
            somatorio += i;
        }
        return somatorio;
    }

    public static Integer calcularFatorial(int numero) {
        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
