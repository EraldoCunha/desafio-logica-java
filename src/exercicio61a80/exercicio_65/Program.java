package exercicio61a80.exercicio_65;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> lista = new ArrayList<>();
        while (true) {

            System.out.print("Informe um valor positivo ou zero para encerrar: ");
            int valor = sc.nextInt();

            if (valor == 0) {
                System.out.println("Encerrando.");
                break;
            } else if (valor < 0) {
                System.out.println("Valor inválido.\n");
            } else {
                lista.add(valor);
            }
        }

        System.out.println("RESULTADO:");
        int qtdPares = verificarQtdPares(lista);
        int qtdImpares = verificarQtdImpares(lista);

        System.out.println("Quantidade de valores pares = " + qtdPares);
        System.out.println("Quantidade de valores ímpares = " + qtdImpares);

        if (qtdPares > 0) {
            double mediaPares = verificarMediaDosPares(lista, qtdPares);
            System.out.println("Média dos valores pares = " + mediaPares);
        } else {
            System.out.println("Nenhum valor par para calcular a média.");
        }

        double mediaGeral = verificarMediaGeral(lista);
        System.out.println("Média geral = " + mediaGeral);

        sc.close();
    }

    public static int verificarQtdPares(List<Integer> lista) {
        int contador = 0;
        for (Integer v : lista) {
            if (v % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }

    public static int verificarQtdImpares(List<Integer> lista) {
        int contador = 0;
        for (Integer v : lista) {
            if (v % 2 != 0) {
                contador++;
            }
        }
        return contador;
    }

    public static double verificarMediaDosPares(List<Integer> lista, int qtdPares) {
        int soma = 0;
        for (Integer v : lista) {
            if (v % 2 == 0) {
                soma += v;
            }
        }
        return (double) soma / qtdPares;
    }

    public static double verificarMediaGeral(List<Integer> lista) {
        int soma = 0;
        for (Integer v : lista) {
            soma += v;
        }
        return (double) soma / lista.size();
    }
}
