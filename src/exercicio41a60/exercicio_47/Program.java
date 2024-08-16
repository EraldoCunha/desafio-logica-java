package exercicio41a60.exercicio_47;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> valores = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Informe o " + i + "º valor: ");
            int valorInformado = sc.nextInt();
            valores.add(valorInformado);
        }

        System.out.println("\nDesses valores " + verificarValoresNegativos(valores) + " são negativos.");

        sc.close();
    }

    public static long verificarValoresNegativos(List<Integer> list) {
        return list.stream().filter(v -> v < 0).count();
    }
}
