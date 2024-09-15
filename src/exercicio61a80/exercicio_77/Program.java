package exercicio61a80.exercicio_77;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dentroDoIntervalo = 0;
        int foraDoIntervalo = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Escreva um valor: ");
            double valor = sc.nextDouble();

            if (valor >= 10 && valor <= 20) {
                dentroDoIntervalo++;
            } else {
                foraDoIntervalo++;
            }
        }

        System.out.printf("%d valor(es) contabilizados dentro do intervalo", dentroDoIntervalo);
        System.out.printf("\n%d valor(es) contabilizados fora do intervalo", foraDoIntervalo);

        sc.close();
    }
}
