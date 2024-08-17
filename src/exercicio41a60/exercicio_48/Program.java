package exercicio41a60.exercicio_48;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = 0;
        int qtdFilhos;
        Senso senso = new Senso();
        List<Habitante> habitantes = new ArrayList<>();

        do{
            System.out.print("Informe seu salário: R$");
            salario = sc.nextDouble();

            if (salario < 0) {
                break;
            }

            System.out.print("Informe a quantidade de filhos: ");
            qtdFilhos = sc.nextInt();

            habitantes.add(new Habitante(salario, qtdFilhos));

        }while(salario > 0);

        System.out.println();
        //a)
        System.out.println("Média salarial da população: R$" + String.format("%.2f" , senso.verificarMediaSalarial(habitantes)));

        //b)
        System.out.println("Média do número de filhos: " + senso.verificarMediaQtdFilhos(habitantes));

        //c)
        System.out.println("Maior salário: R$" + String.format("%.2f" , senso.verificarMaiorSalario(habitantes)));

        //d)
        System.out.println("Percentual de pessoas com salário até R$100.00: " + String.format("%.2f", senso.percentualSalarioAteCem(habitantes)) + "%");

        sc.close();
    }
}
