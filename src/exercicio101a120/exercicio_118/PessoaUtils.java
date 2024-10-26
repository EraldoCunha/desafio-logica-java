package exercicio101a120.exercicio_118;

import java.util.List;

public class PessoaUtils {

    public static Integer mulheresAltas(List<Pessoa> pessoas) {
        int contador = 0;
        for (Pessoa p : pessoas) {
            if (p.getSexo() == Sexo.FEMININO && p.getAltura() > 1.70) {
                contador++;
            }
        }
        return contador;
    }

    public static Double homensAcimaDoPeso(List<Pessoa> pessoas) {
        int contadorHomens = 0;
        int contadorHomensAcimaDoPeso = 0;
        for (Pessoa p : pessoas) {
            if (p.getSexo() == Sexo.MASCULINO) {
                contadorHomens++;
                if (p.getImc() > 25) {
                    contadorHomensAcimaDoPeso++;
                }
            }
        }
        return contadorHomens > 0 ? (contadorHomensAcimaDoPeso * 100.0) / contadorHomens : 0.0;
    }

    public static Double mulheresAbaixoDoPeso(List<Pessoa> pessoas) {
        int contadorMulheres = 0;
        int contadorMulheresAbaixoDoPeso = 0;
        for (Pessoa p : pessoas) {
            if (p.getSexo() == Sexo.FEMININO) {
                contadorMulheres++;
                if (p.getImc() < 16) {
                    contadorMulheresAbaixoDoPeso++;
                }
            }
        }
        return contadorMulheres > 0 ? (contadorMulheresAbaixoDoPeso * 100.0) / contadorMulheres : 0.0;
    }

    public static Integer homensBaixos(List<Pessoa> pessoas) {
        int contador = 0;
        for (Pessoa p : pessoas) {
            if (p.getSexo() == Sexo.MASCULINO && p.getAltura() < 1.60) {
                contador++;
            }
        }
        return contador;
    }
}
