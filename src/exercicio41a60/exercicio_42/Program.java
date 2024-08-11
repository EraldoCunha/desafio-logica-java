package exercicio41a60.exercicio_42;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um valor em Reais ");
        int valor = sc.nextInt();

        int valor100 = valor / 100;
        int resto = valor % 100;
        int valor50 = resto / 50;
        resto = resto % 50;
        int valor10 = resto / 10;
        resto = resto % 10;
        int valor5 = resto / 5;
        int valor1 = resto % 5;

        System.out.printf("O valor informado de R$%d pode ser representando com: %n%d notas de 100 %n%d notas de 50 %n%d notas de 10 %n%d notas de 5 %n%d notas de 1", valor, valor100, valor50, valor10, valor5, valor1);


        sc.close();
    }
}
