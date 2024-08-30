package exercicio61a80.exercicio_61;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int intervalo1 = 0; //Referente a numeros entre 0 e 25
        int intervalo2 = 0; //Referente a numeros entre 26 e 50
        int intervalo3 = 0; //Referente a numeros entre 51 e 75
        int intervalo4 = 0; //Referente a numeros entre 76 e 100

        boolean valorValido = true;

        do {
            System.out.print("Informe um valor entre 0 e 100, ou um valor negativo para encerrar: ");
            int valor = sc.nextInt();

            if (valor >= 0 && valor <= 25) {
                intervalo1++;
            } else if (valor >= 26 && valor <= 50) {
                intervalo2++;
            } else if (valor >= 51 && valor <= 75) {
                intervalo3++;
            } else if (valor >= 76 && valor <= 100) {
                intervalo4++;
            } else if (valor < 0) {
                valorValido = false;
            } else {
                System.out.println("Valor inválido.");
            }

        } while (valorValido);

        System.out.println("\nQuantidade de valores entre 0 e 25: " + intervalo1);
        System.out.println("Quantidade de valores entre 26 e 50: " + intervalo2);
        System.out.println("Quantidade de valores entre 51 e 75: " + intervalo3);
        System.out.println("Quantidade de valores entre 76 e 100: " + intervalo4);

        sc.close();
    }

}
