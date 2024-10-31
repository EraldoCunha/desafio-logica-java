package exercicio121a123.exercicio_123;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o valor de xA: ");
        double xA = sc.nextDouble();
        System.out.print("Entre com o valor de yA: ");
        double yA = sc.nextDouble();
        System.out.print("Entre com o valor de xB: ");
        double xB = sc.nextDouble();
        System.out.print("Entre com o valor de yB: ");
        double yB = sc.nextDouble();
        System.out.print("Entre com o valor de xC: ");
        double xC = sc.nextDouble();
        System.out.print("Entre com o valor de yC: ");
        double yC = sc.nextDouble();

        double ladoAB = calcularDistancia(xA, yA, xB, yB);
        double ladoBC = calcularDistancia(xB, yB, xC, yC);
        double ladoCA = calcularDistancia(xC, yC, xA, yA);

        double perimetro = ladoAB + ladoBC + ladoCA;
        System.out.printf("Perímetro do triângulo: %.2f%n", perimetro);

        double semiPerimetro = perimetro / 2;
        double area = Math.sqrt(semiPerimetro *
                (semiPerimetro - ladoAB) *
                (semiPerimetro - ladoBC) *
                (semiPerimetro - ladoCA));
        System.out.printf("Área do triângulo: %.2f%n", area);

        sc.close();
    }

    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
