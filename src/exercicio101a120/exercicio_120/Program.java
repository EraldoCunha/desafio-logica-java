package exercicio101a120.exercicio_120;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        List<Integer> numerosPrimos = new ArrayList<>();
        List<Integer> numerosNaoPrimos = new ArrayList<>();

        System.out.print("Quantos números deseja verificar? ");
        int quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++) {
            boolean numeroInteiro = false;
            while (!numeroInteiro) {
                System.out.println("Digite o " + (i + 1) + "º numero: ");
                int numero = sc.nextInt();
                if (numero > 0) {
                    numeros.add(numero);
                    numeroInteiro = true;
                }
            }
        }

        numerosPrimos = Utils.primos(numeros);
        numerosNaoPrimos = Utils.naoPrimos(numeros);

        System.out.println("\nValores primos: ");
        Utils.imprimirVetor(numerosPrimos);

        System.out.println("\nValores não primos: ");
        Utils.imprimirVetor(numerosNaoPrimos);

        sc.close();
    }
}
