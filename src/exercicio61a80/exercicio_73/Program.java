package exercicio61a80.exercicio_73;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int contador = 0;

        List<Integer> valores = new ArrayList<>();
        System.out.println("Informe 500 valores inteiros e positivos:");


        for (int i = 1; i <= 500; i++) {
            while (true) {
                try {
                    int valor = sc.nextInt();
                    if (valor <= 0) {
                        System.out.println("Apenas valores inteiros e positivos serão aceitos, tente novamente");
                    } else {
                        valores.add(valor);
                        break;
                    }
                } catch (RuntimeException e) {
                    throw new RuntimeException(e.getMessage() + "Apenas valores inteiros e positivos serão aceitos, tente novamente");
                }
            }
        }

        System.out.println("Maior valor = " + localizarMaiorValor(valores));
        System.out.println("Menor valor = " + localizarMenorValor(valores));
        double media = verificarMedia(valores);
        System.out.printf("Média dos valores = %.2f" , media);

        sc.close();
    }


    public static Integer localizarMaiorValor(List<Integer> lista) {
        int maior = lista.get(0);

        for (Integer v : lista) {
            if( v >= maior){
                maior = v;
            }
        }
        return maior;
    }

    public static Integer localizarMenorValor(List<Integer> lista) {
        int menor = lista.get(0);

        for (Integer v : lista) {
            if( v <= menor){
                menor = v;
            }
        }
        return menor;
    }

    public static Double verificarMedia(List<Integer> lista) {
        int soma = 0;

        for (Integer v : lista) {
            soma += v;
        }
        return (double) soma / lista.size();
    }
}

