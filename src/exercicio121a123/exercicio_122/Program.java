package exercicio121a123.exercicio_122;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> vetor = new ArrayList<>();

        System.out.println("Digite um valor para incluir no vetor ou 0 (zero) para encerrar o preenchimento.");
        while(true){
            int valor = sc.nextInt();
            if (valor == 0){
                System.out.println("Encerrando o preenchimento do vetor.");
                break;
            }
            adicionarElementoAoVetor(vetor, valor);
        }

        System.out.println("\nImprimindo os valores do vetor:");
        imprimirVetor(vetor);

        ordenarValoresDoVetor(vetor);

        System.out.println("\nImprimindo os valores do vetor ordenados de forma crescente:");
        imprimirVetor(vetor);

        sc.close();
    }

    public static void adicionarElementoAoVetor(List<Integer> lista, Integer valor){
        lista.add(valor);
    }

    public static void imprimirVetor(List<Integer> lista) {
        for(Integer v : lista){
            System.out.print(v + " ");
        }
        System.out.println();
    }

    public static void ordenarValoresDoVetor(List<Integer> lista){
        Collections.sort(lista);
    }
}