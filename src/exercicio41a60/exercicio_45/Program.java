package exercicio41a60.exercicio_45;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu numero de identificação: ");
        int identificacao = sc.nextInt();

        List<Double> notas = new ArrayList<>();

        for(int i = 1; i <= 3;i++){
            System.out.print("Informe a sua " + i + "ª nota:");
            double nota = sc.nextDouble();
            notas.add(nota);
        }

        System.out.print("Informe a média dos exercícios: ");
        double mediaExercicios = sc.nextDouble();

        Aluno aluno = new Aluno(identificacao, notas,mediaExercicios);

        System.out.println(aluno);




        sc.close();
    }

}
