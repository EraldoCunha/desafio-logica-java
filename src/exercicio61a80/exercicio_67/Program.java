package exercicio61a80.exercicio_67;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        int multiplicacao = 1;
        boolean temPar = false;

        System.out.println("Digite números inteiros e positivos (0 para encerrar):");

        do {
            numero = scanner.nextInt();
            if (numero > 0 && numero % 2 == 0) {
                multiplicacao *= numero;
                temPar = true; // Marca que um número par foi inserido
            }
        } while (numero != 0);

        if (temPar) {
            System.out.println("O produto dos números pares é: " + multiplicacao);
        } else {
            System.out.println("Nenhum número par foi inserido.");
        }
    }
}