package exercicio41a60.exercicio_57;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número de termos de uma progressão aritmética: ");
        int n = sc.nextInt();

        System.out.print("Informe o primeiro termo da progressão: ");
        int a1 = sc.nextInt();

        System.out.print("Informe a razão da progressão: ");
        int r = sc.nextInt();

        int soma = 0;
        int termoAtual = a1;

        for (int i = 0; i < n; i++) {
            System.out.println(termoAtual);
            soma += termoAtual;
            termoAtual += r;
        }

        System.out.println("A soma dos termos é de: " + soma);

        sc.close();
    }
}
