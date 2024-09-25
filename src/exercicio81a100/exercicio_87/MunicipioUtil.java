package exercicio81a100.exercicio_87;

import java.util.List;

public class MunicipioUtil {

    public static void maiorIndiceDeAcidentes(List<Municipio> lista) {
        Municipio maior = new Municipio(lista.get(0));

        for (Municipio m : lista) {
            if (maior.getQtdAcidentes() < m.getQtdAcidentes()) {
                maior = m;
            }
        }
        System.out.println("A cidade código: "
                + maior.getCodigo()
                + " apresentou o maior índice de acidentes contabilizando "
                + maior.getQtdAcidentes()
                + " no total.");
    }

    public static void menorIndiceDeAcidentes(List<Municipio> lista) {
        Municipio menor = new Municipio(lista.get(0));

        for (Municipio m : lista) {
            if (menor.getQtdAcidentes() > m.getQtdAcidentes()) {
                menor = m;
            }
        }
        System.out.println("A cidade código: "
                + menor.getCodigo()
                + " apresentou o menor índice de acidentes contabilizando "
                + menor.getQtdAcidentes()
                + " no total.");
    }

    public static Double mediaQtdVeiculos(List<Municipio> lista) {
        double soma = 0d;
        for (Municipio m : lista) {
            soma += m.getQtdVeiculos();
        }

        return soma / lista.size();
    }

    public static Double mediaQtdAcidentes(List<Municipio> lista) {
        double soma = 0d;
        int contador = 0;
        for (Municipio m : lista) {
            if (m.getEstado() == Estado.RS) {
                soma += m.getQtdAcidentes();
                contador++;
            }
        }

        return soma / contador;
    }
}
