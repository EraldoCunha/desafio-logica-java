package exercicio61a80.exercicio_64;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Para encerrar digite um valor negativo");
        while (true) {

            System.out.print("Informe o valor de m: ");
            int m = sc.nextInt();

            if (m <= 0) {
                System.out.println("Encerrando.");
                break;
            } else if (m % 2 == 0) {
                System.out.println("O valor m é par e possui " + verificarDivisoresPar(m) + " divisores.");
            } else if (m < 10) {
                System.out.println("O valor m é impar e menor que 10, seu fatorial é " + verificarFatorialImpar(m) + ".");
            } else {
                System.out.println("O valor m é impar e maior ou igual a 10, a soma de um até m é " + verificarSomaInteiros(m) + ".");
            }
        }

        sc.close();
    }

    public static Integer verificarDivisoresPar(int valor) {
        int contador = 0;
        for (int i = 1; i <= valor; i++) {
            if (valor % i == 0) {
                contador++;
            }
        }
        return contador;
    }

    public static Integer verificarFatorialImpar(int valor) {
        int fatorial = 1;
        for (int i = 1; i <= valor; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static Integer verificarSomaInteiros(int valor) {
        int soma = 0;
        for (int i = 1; i <= valor; i++) {
            soma += i;
        }
        return soma;
    }
}
