package exercicio101a120.exercicio_118;

import java.util.List;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Pessoa> pessoas = Seeding.gerarPessoas(100);

        int mulheresAltas = PessoaUtils.mulheresAltas(pessoas);
        double homensAcimaDoPeso = PessoaUtils.homensAcimaDoPeso(pessoas);
        double mulheresAbaixoDoPeso = PessoaUtils.mulheresAbaixoDoPeso(pessoas);
        int homensBaixos = PessoaUtils.homensBaixos(pessoas);

        System.out.println("Quantidade de mulheres com mais de 1.70 de altura: " + mulheresAltas);
        System.out.printf("Percentual de homens com IMC maior que 25: %.2f%% %n", homensAcimaDoPeso);
        System.out.printf("Percentual de mulheres com IMC abaixo de 16: %.2f%% %n", mulheresAbaixoDoPeso);
        System.out.println("Quantidade de homens com menos de 1.60 de altura: " + homensBaixos);

    }
}
