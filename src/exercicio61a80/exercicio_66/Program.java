package exercicio61a80.exercicio_66;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> lista = new ArrayList<>();
        while (true) {
            System.out.print("Informe um valor inteiro ou zero para encerrar: ");
            int valor = sc.nextInt();
            if (valor == 0) {
                System.out.println("Encerrando.");
                break;
            }
            lista.add(valor);
        }

        int soma = somatorioNegativos(lista);
        System.out.println("Soma dos valores negativos = " + soma);

        sc.close();
    }

    public static int somatorioNegativos(List<Integer> lista) {
        int soma = 0;
        for (Integer v : lista) {
            if (v < 0) {
                soma += v;
            }
        }
        return soma;
    }
}