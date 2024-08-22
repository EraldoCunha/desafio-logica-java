package exercicio41a60.exercicio_53;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Aluno> alunos = new ArrayList<>();

        boolean codigoZero = false;

        do {
            List<Double> notas = new ArrayList<>();
            System.out.print("\nInforme seu código de aluno: ");
            int codigo = sc.nextInt();
            if (codigo == 0) {
                codigoZero = true;
            } else {
                double nota;
                for (int i = 1; i <= 3; i++) {
                    System.out.print("Informe a sua " + i + "ª nota: ");
                    nota = sc.nextDouble();
                    notas.add(nota);
                }
                alunos.add(new Aluno(codigo, notas.get(0), notas.get(1), notas.get(2)));
            }

        } while (!codigoZero);

        for (Aluno a : alunos) {
            a.imprimirAluno();
        }

        sc.close();
    }
}
