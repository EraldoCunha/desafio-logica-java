package exercicio41a60.exercicio_46;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o índice de poluição medido: ");
        double indice = sc.nextDouble();

        System.out.print("\n" + verificarIndice(indice));

        sc.close();
    }

    public static String verificarIndice(double indice) {
        if (indice >= 0.05 && indice <= 0.25) {
            return "Índice de poluição aceitável.";
        }
        if (indice > 0.25 && indice <= 0.3) {
            return "As indústrias do 1º grupo serão intimadas a suspenderem suas atividades.";
        }
        if (indice > 0.3 && indice <= 0.4) {
            return "As indústrias do 1º e 2º grupo serão intimadas a suspenderem suas atividades.";

        }
        if (indice > 0.4) {
            return "As indústrias dos 3 grupos serão notificados a paralisarem suas atividades.";
        }
        return "Índice de poluição abaixo do aceitável.";
    }
}