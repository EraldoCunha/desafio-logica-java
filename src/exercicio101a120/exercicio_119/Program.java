package exercicio101a120.exercicio_119;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor base: ");
        int base = sc.nextInt();
        System.out.println("Informe o valor do expoente: ");
        int expoente = sc.nextInt();

        double potencia = calcularPotencia(base, expoente);
        System.out.printf("A potência é de: %.2f", potencia);

        sc.close();
    }

    public static Double calcularPotencia(int num1, int num2) {
        if (num1 > 0 && num2 > 0) {
            return Math.pow(num1, num2);
        } else {
            return 0d;
        }
    }
}
