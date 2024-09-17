package exercicio61a80.exercicio_79;

import java.util.List;

public class TurmaUtils {

    public static double verificarMaiorAltura(List<Pessoa> turma) {
        double maior = turma.get(0).getAltura();

        for (Pessoa p : turma) {
            if (maior < p.getAltura()) {
                maior = p.getAltura();
            }
        }

        return maior;
    }

    public static double verificarMenorAltura(List<Pessoa> turma) {
        double menor = turma.get(0).getAltura();

        for (Pessoa p : turma) {
            if (menor > p.getAltura()) {
                menor = p.getAltura();
            }
        }

        return menor;
    }

    public static double verificarMediaAlturaMulheres(List<Pessoa> turma) {
        double soma = 0;
        double contador = 0;

        for (Pessoa p : turma) {
            if (p.getCodigo() == Sexo.FEMININO) {
                soma += p.getAltura();
                contador++;
            }
        }
        return soma / contador;
    }

    public static double verificarMediaAlturaTurma(List<Pessoa> turma) {
        double soma = 0;

        for (Pessoa p : turma) {
            soma += p.getAltura();
        }

        return soma / turma.size();
    }
}
