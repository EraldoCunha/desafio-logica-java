package exercicio41a60.exercicio_55;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Double> numeros  = new ArrayList<>();

        for(int i = 1; i <= 50; i++){
            System.out.print("Digite o " + i + " º número: ");
            double numero = sc.nextDouble();
            numeros.add(numero);
        }

        Optional<Double> maior = numeros.stream().max(Double::compare);
        Optional<Double> menor = numeros.stream().min(Double::compare);

        maior.ifPresent(value -> System.out.println("Maior número = " + value));
        menor.ifPresent(value -> System.out.println("Menor número = " + value));

        sc.close();
    }

}
