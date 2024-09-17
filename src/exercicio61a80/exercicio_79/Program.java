package exercicio61a80.exercicio_79;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Pessoa> turma = new ArrayList<>();

        for (int i = 1; i <= 50; i++) {

            System.out.print("Informe a sua altura: ");
            double altura = sc.nextDouble();

            int codigo;

            while (true) {
                System.out.print("Informe o seu sexo (1 = Masculino ou 2 = Feminino): ");
                codigo = sc.nextInt();
                if (codigo == 1 || codigo == 2) {
                    break;
                }
            }

            turma.add(new Pessoa(altura, codigo));
        }

        double maiorAltura = TurmaUtils.verificarMaiorAltura(turma);
        double menorAltura = TurmaUtils.verificarMenorAltura(turma);
        double mediaAlturaMulheres = TurmaUtils.verificarMediaAlturaMulheres(turma);
        double mediaAlturaTurma = TurmaUtils.verificarMediaAlturaTurma(turma);

        System.out.printf("\nMaior altura = %.2f%nMenor altura = %.2f%nMédia de altura entre as mulheres = %.2f%nMédia de altura da turma = %.2f"
                , maiorAltura, menorAltura, mediaAlturaMulheres, mediaAlturaTurma);

        sc.close();
    }

}
