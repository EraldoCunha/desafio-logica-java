package exercicio61a80.exercicio_68;

import java.util.*;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Habitante> habitantes = new ArrayList<>(Arrays.asList(
                new Habitante("João Afonso", 41, Sexo.M, 2800.00)
                , new Habitante("Maria Silva", 29, Sexo.F, 95.00)
                , new Habitante("Carlos Mendes", 34, Sexo.M, 80.00)
                , new Habitante("Ana Clara", 22, Sexo.F, 100.00)
                , new Habitante("José Santos", 45, Sexo.M, 70.50)
                , new Habitante("Fernanda Costa", 31, Sexo.F, 60.00)
                , new Habitante("Pedro Oliveira", 36, Sexo.M, 1500.00)
                , new Habitante("Luciana Almeida", 28, Sexo.F, 1250.00)
                , new Habitante("Rafael Nunes", 40, Sexo.M, 1800.50)
                , new Habitante("Cláudia Ferreira", 37, Sexo.F, 2300.00)
                , new Habitante("Roberto Lima", 50, Sexo.M, 3200.00)
                , new Habitante("Beatriz Souza", 33, Sexo.F, 1750.75)));

        double mediaSalarial = Habitante.mediaSalarial(habitantes);
        int maiorIdade = Habitante.maiorIdade(habitantes);
        int menorIdade = Habitante.menorIdade(habitantes);
        int qtdMulhesComSalarioAteCemReais = Habitante.qtdMulheresAteCemReais(habitantes);

        System.out.printf("Média salarial R$%.2f%n" , mediaSalarial);
        System.out.println("Maior idade = " + maiorIdade);
        System.out.println("Menor Idade = " + menorIdade);
        System.out.println("Quantidade de mulheres que ganham até R$100.00 = " + qtdMulhesComSalarioAteCemReais);
    }
}
