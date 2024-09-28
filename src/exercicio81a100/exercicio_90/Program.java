package exercicio81a100.exercicio_90;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Aluno> alunos = new ArrayList<>();

        for (int i = 1; i <= 75; i++) {
            System.out.println("Digite o número de matrícula do aluno " + i + ":");
            int matricula = sc.nextInt();

            double nota;
            while (true) {
                System.out.println("Digite a nota final do aluno (0,0 a 10,0):");
                nota = sc.nextDouble();
                if (nota >= 0 && nota <= 10) {
                    break;
                }
            }
            int notaInt = (int) nota;

            Aluno aluno = new Aluno(matricula, nota);

            switch (notaInt) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    aluno.setConceito(Conceito.D);
                    break;
                case 5:
                case 6:
                    aluno.setConceito(Conceito.C);
                    break;
                case 7:
                case 8:
                    aluno.setConceito(Conceito.B);
                    break;
                case 9:
                case 10:
                    aluno.setConceito(Conceito.A);
                    break;
                default:
                    aluno.setConceito(null);
            }

            alunos.add(aluno);
        }

        for(Aluno a : alunos){
            a.imprimirAlunos();
        }

        sc.close();
    }
}
