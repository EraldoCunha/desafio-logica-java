package exercicio81a100.exercicio_87;

import java.util.List;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Municipio> municipios = Seeding.gerarMunicipios();

        System.out.println();
        MunicipioUtil.maiorIndiceDeAcidentes(municipios);
        MunicipioUtil.menorIndiceDeAcidentes(municipios);

        double mediaQtdVeiculos = MunicipioUtil.mediaQtdVeiculos(municipios);
        double mediaQtdAcidentes = MunicipioUtil.mediaQtdAcidentes(municipios);

        System.out.printf("A média de veículos nas cidade brasileiras é de %.2f%n" , mediaQtdVeiculos);
        System.out.printf("A média de acidentes com vítimas entre as cidades do Rio Grande do Sul é de %.2f" , mediaQtdAcidentes);

    }
}
