package exercicio61a80.exercicio_69;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //No enunciado pede para não utilizar vetores ou matrizes, tecnicamente uma List não se encaixa como vetor ou matriz
        List<Habitante> lista = new ArrayList<>();


        do {
            System.out.print("Informe a sua idade(ou idade negativa para encerrar): ");
            int idade = sc.nextInt();
            sc.nextLine();

            if (idade < 0) {
                break;
            }

            System.out.print("Informe de nome: ");
            String nome = sc.nextLine();

            boolean sexoValido = false;
            String sexo;
            do {
                System.out.print("Informe seu sexo (F/M): ");
                sexo = sc.nextLine();
                if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
                    sexoValido = true;
                }
            } while (!sexoValido);

            System.out.print("Informe o seu salário: R$");
            double salario = sc.nextDouble();
            sc.nextLine();


            Habitante habitante = new Habitante(nome, idade, sexo, salario);

            lista.add(habitante);

        }while(true);


        double mediaSalarial = Habitante.mediaSalarial(lista);
        int maiorIdade = Habitante.maiorIdade(lista);
        int menorIdade = Habitante.menorIdade(lista);
        int qtdMulhesComSalarioAteCemReais = Habitante.qtdMulheresAteCemReais(lista);

        System.out.printf("Média salarial R$%.2f%n" , mediaSalarial);
        System.out.println("Maior idade = " + maiorIdade);
        System.out.println("Menor Idade = " + menorIdade);
        System.out.println("Quantidade de mulheres que ganham até R$100.00 = " + qtdMulhesComSalarioAteCemReais);

        sc.close();
    }
}
