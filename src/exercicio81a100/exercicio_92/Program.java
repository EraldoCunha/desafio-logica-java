package exercicio81a100.exercicio_92;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de n: ");
        int n = sc.nextInt();

        System.out.print("Digite o valor de p: ");
        int p = sc.nextInt();

        long combinacao = calcularFatorial(n) / (calcularFatorial(p) * calcularFatorial(n - p));

        long arranjo = calcularFatorial(n) / calcularFatorial(n - p);

        System.out.println("Combinação C(" + n + ", " + p + ") = " + combinacao);
        System.out.println("Arranjo A(" + n + ", " + p + ") = " + arranjo);
    }

    public static long calcularFatorial(int num) {
        long resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }

}
