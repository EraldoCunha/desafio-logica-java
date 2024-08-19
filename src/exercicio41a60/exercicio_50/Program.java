package exercicio41a60.exercicio_50;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();
        int numero;
        double somatorio = 0;

        do {
            System.out.print("Informe um número a ser calculado na média aritmética: ");
            numero = sc.nextInt();

            if (numero > 0) {
                numeros.add(numero);
            }

        } while (numero > 0);

        for (Integer n : numeros) {
            somatorio += n;
        }

        somatorio /= numeros.size();

        System.out.printf("%nA média aritmética dos numeros informados é de: %.2f.", somatorio);

        sc.close();
    }
}
