package exercicio81a100.exercicio_100;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] gabarito = new int[13];
        System.out.println("Digite o gabarito (13 valores entre 1 e 3):");
        for (int i = 0; i < 13; i++) {
            gabarito[i] = sc.nextInt();
        }

        char continuar = 'S';
        while (continuar == 'S') {
            System.out.print("Digite o número do cartão do apostador: ");
            int numeroCartao = sc.nextInt();

            int[] respostas = new int[13];
            System.out.println("Digite as respostas do apostador (13 valores entre 1 e 3):");
            for (int i = 0; i < 13; i++) {
                respostas[i] = sc.nextInt();
            }

            int acertos = 0;
            for (int i = 0; i < 13; i++) {
                if (respostas[i] == gabarito[i]) {
                    acertos++;
                }
            }

            System.out.println("Apostador número " + numeroCartao + " acertou " + acertos + " vezes.");

            if (acertos == 13) {
                System.out.println("Ganhador!");
            }

            System.out.print("Deseja verificar outro apostador? (S/N): ");
            continuar = sc.next().toUpperCase().charAt(0);
        }

        sc.close();
    }
}
