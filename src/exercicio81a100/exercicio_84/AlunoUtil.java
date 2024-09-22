package exercicio81a100.exercicio_84;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlunoUtil {


    public static double vericicarMedia(double nota1, double nota2, double nota3){
        List<Double> notas = new ArrayList<>(Arrays.asList(nota1, nota2, nota3));
        return (notas.get(0) * 2 + notas.get(1) * 5 + notas.get(2) * 3) / 10;
    }

    public static SituacaoAcademica verificarSituacacaoAcademica(double media){
        if (media >= 7){
            return SituacaoAcademica.APROVADO;
        }else {
            return SituacaoAcademica.REPROVADO;
        }
    }

    public static void imprimirAluno(Aluno aluno){
        System.out.printf("%nNota 1: %.1f%nNota 2: %.1f%nNota 3: %.1f%nMedia Ponderada: %.1f%nSituação Acadêmica: %s%n"
                , aluno.getNota1(), aluno.getNota2(), aluno.getNota3(), aluno.getMedia(), aluno.getSituacaoAcademica());
    }

    public static double verificarMediaGeral(List<Aluno> alunos){
        double soma = 0;
        for(Aluno a : alunos){
            soma += a.getMedia();
        }
        return soma / alunos.size();
    }
}
