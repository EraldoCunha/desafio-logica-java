package exercicio41a60.exercicio_60;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor;
        List<Double> valores = new ArrayList<>();

        do {
            System.out.print("Informe algum valor a ser contabilizado,para parar digite 0: ");
            //Fiz uma condição de parada para que não vire um looping infinito que é o zero
            valor = sc.nextDouble();
            if(valor != 0) {
                valores.add(valor);
            }
        } while (valor != 0);

        System.out.printf("Média Aritmética = %.2f%n", calcularMediaAritmetica(valores));
        System.out.printf("Quantidade de valores positivos = %d%n", somatorioDeValoresPositivos(valores));
        System.out.printf("Quantidade de valores negativos = %d%n", somatorioDeValoresNegativos(valores));
        System.out.printf("Porcentagem de valores positivos = %.2f%%%n", porcentagemDeValoresPositivos(valores));
        System.out.printf("Porcentagem de valores negativos = %.2f%%%n", porcentagemDeValoresNegativos(valores));

        sc.close();
    }

    public static Double calcularMediaAritmetica(List<Double> lista) {
        double somatorio = 0;
        for (Double v : lista) {
            somatorio += v;
        }
        return somatorio / lista.size();
    }

    public static Integer somatorioDeValoresPositivos(List<Double> lista) {
        int contador = 0;
        for (Double v : lista) {
            if (v > 0) {
                contador++;
            }
        }
        return contador;
    }

    public static Integer somatorioDeValoresNegativos(List<Double> lista) {
        int contador = 0;
        for (Double v : lista) {
            if (v < 0) {
                contador++;
            }
        }
        return contador;
    }

    public static Double porcentagemDeValoresPositivos(List<Double> lista) {
        int positivos = somatorioDeValoresPositivos(lista);

        return (double) ((positivos * 100) / lista.size());
    }

    public static Double porcentagemDeValoresNegativos(List<Double> lista) {
        int negativos = somatorioDeValoresNegativos(lista);

        return (double) ((negativos * 100) / lista.size());
    }
}
