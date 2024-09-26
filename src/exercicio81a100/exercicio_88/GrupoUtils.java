package exercicio81a100.exercicio_88;

import java.util.List;

public class GrupoUtils {

    public static double verificarMediaAlturaGrupo(List<Pessoa> lista) {
        double soma = 0;

        for (Pessoa p : lista) {
            soma += p.getAltura();
        }
        return soma / lista.size();
    }

    public static double verificarMediaAlturaMulheres(List<Pessoa> lista) {
        double soma = 0;
        double contador = 0;

        for (Pessoa p : lista) {
            if (p.getCodigo() == Sexo.FEMININO) {
                soma += p.getAltura();
                contador++;
            }
        }
        return soma / contador;
    }

    public static double verificarMediaIdadeHomens(List<Pessoa> lista) {
        double soma = 0;
        double contador = 0;

        for (Pessoa p : lista) {
            if (p.getCodigo() == Sexo.MASCULINO) {
                soma += p.getIdade();
                contador++;
            }
        }
        return soma / contador;
    }

    public static double verificarIdadePessoas(List<Pessoa> lista) {
        int contador = 0;
        for(Pessoa p : lista){
            if(p.getIdade() >= 18 && p.getIdade() <= 35){
                contador++;
            }
        }
        return (contador / (double) lista.size()) * 100;
    }
}
