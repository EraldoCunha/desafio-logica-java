package exercicio41a60.exercicio_59;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores terão o seu fatorial calculado? ");
        int n = sc.nextInt();
        System.out.println();

        List<Integer> valores = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            boolean valorPositivo = false;

            while (!valorPositivo) {
                System.out.print("Escreva o " + i + "º valor para ser calculado: ");
                int valor = sc.nextInt();

                if (valor >= 0) {
                    valores.add(valor);
                    valorPositivo = true;
                } else {
                    System.out.println("Por favor, insira um valor positivo.");
                }
            }
        }
        System.out.printf("\n| %-10s | %-10s\n", "Valor", "Fatorial");
        System.out.println("----------------------------");

        for (Integer v : valores) {
            int fatorial = calcularFatorial(v);
            System.out.printf("| %-10d | %-10d\n", v, fatorial);
            n--;
        }

        sc.close();
    }

    public static Integer calcularFatorial(int numero) {
        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
