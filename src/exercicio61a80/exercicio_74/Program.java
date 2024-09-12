package exercicio61a80.exercicio_74;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            double s = 0;
            int valor = -1;
            System.out.print("Informe um valor inteiro e positivo: ");

            while (valor <= 0) {
                valor = sc.nextInt();
                if (valor <= 0) {
                    System.out.println("Informe um valor válido...");
                }
            }

            for(int i = 1; i <= valor; i++) {
                s += (double) 1 / i;
                System.out.printf("%.5f%n" , s);
            }

            System.out.printf("Valor final de S: %.2f\n", s);
        }
        catch (RuntimeException e){
            System.out.println("Apenas valores inteiros e positivos serão aceitos!");
        }

        sc.close();
    }
}
