package exercicio81a100.exercicio_88;

import java.util.List;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Pessoa> pessoas = Seeding.gerarPessoas(1000);

        double mediaIdadeGrupo = GrupoUtils.verificarMediaAlturaGrupo(pessoas);
        double mediaAlturaMulheres = GrupoUtils.verificarMediaAlturaMulheres(pessoas);
        int mediaIdadeHomens = (int) GrupoUtils.verificarMediaIdadeHomens(pessoas);
        double percentualIdades = GrupoUtils.verificarIdadePessoas(pessoas);

        System.out.printf("%nA média de altura do grupo é de %.2f%n" , mediaIdadeGrupo);
        System.out.printf("A média de altura das mulheres é de %.2f%n" , mediaAlturaMulheres);
        System.out.printf("A média de idade dos homens é de %d%n" , mediaIdadeHomens);
        System.out.printf("O percentual de pessoas com idade entre 18 e 35 é de %.1f%%" , percentualIdades);

    }
}
