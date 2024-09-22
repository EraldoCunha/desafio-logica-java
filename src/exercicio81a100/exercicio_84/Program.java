package exercicio81a100.exercicio_84;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Aluno> alunos = new ArrayList<>();

        for(int i = 1; i <= 3 ; i++){

            System.out.println("Informações do aluno nº" + i);
            List<Double> notas = new ArrayList<>();
            for (int j = 1; j <= 3; j++){
                double nota;
                do {
                    System.out.print("Informe a " + j + "ª nota (0 a 10): ");
                    nota = sc.nextDouble();
                    if (nota < 0 || nota > 10) {
                        System.out.println("Nota inválida. Por favor, insira um valor entre 0 e 10.");
                    }
                } while (nota < 0 || nota > 10);
                notas.add(nota);
            }
            alunos.add(new Aluno(notas.get(0), notas.get(1), notas.get(2)));
        }

        for (Aluno a : alunos){
            AlunoUtil.imprimirAluno(a);
        }

        double mediaGeral = AlunoUtil.verificarMediaGeral(alunos);

        System.out.printf("%nMédia geral dos alunos: %.2f", mediaGeral);

        sc.close();
    }
}
