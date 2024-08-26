package exercicio41a60.exercicio_56;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Aluno> alunos = new ArrayList<>();
        int codigo;
        do{
            System.out.print("Informe o código do aluno: ");
            codigo = sc.nextInt();
            if (codigo >= 0){
                List<Double> notas = new ArrayList<>();
                for (int i = 1; i <= 3; i++){
                    System.out.print("Informe a " + i + "ª nota: ");
                    double nota = sc.nextDouble();
                    notas.add(nota);
                }
                alunos.add(new Aluno(codigo, notas.get(0), notas.get(1), notas.get(2)));
            }

        }while(codigo >= 0);

        for (Aluno a : alunos){
            a.imprimirAluno();
        }

        sc.close();
    }
}
