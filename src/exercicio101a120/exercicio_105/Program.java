package exercicio101a120.exercicio_105;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] gabarito = new char[10];
        Aluno[] alunos = new Aluno[20];

        System.out.println("Informe as respostas do gabarito:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Resposta  " + (i + 1) + ": ");
            gabarito[i] = sc.next().charAt(0);
        }

        System.out.println("Respostas dos alunos: ");
        for (int i = 0; i < 20; i++) {
            System.out.println("Aluno " + (i + 1) + ": ");
            char[] gabaritoAluno = new char[10];
            for (int j = 0; j < 10; j++) {
                System.out.print("Resposta  " + (j + 1) + ": ");
                gabaritoAluno[j] = sc.next().charAt(0);
            }
            Aluno aluno = new Aluno(gabarito, gabaritoAluno);
            alunos[i] = aluno;
        }

        for (Aluno a : alunos) {
            System.out.println(a);
        }

        sc.close();
    }
}
