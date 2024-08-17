package exercicio41a60.exercicio_48;

import java.util.List;

public class Habitante {

    private double salario;
    private int qtdFilhos;

    public Habitante(double salario, int qtdFilhos) {
        this.salario = salario;
        this.qtdFilhos = qtdFilhos;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getQtdFilhos() {
        return qtdFilhos;
    }

    public void setQtdFilhos() {
        this.qtdFilhos = qtdFilhos;
    }

    public double verificarMediaSalarial(List<Habitante> list) {
        double media = 0;
        for (Habitante s : list) {
            media += s.getSalario();
        }
        return media / list.size();
    }

    public double verificarMediaQtdFilhos(List<Habitante> list) {
        double media = 0;
        for (Habitante s : list) {
            media += s.getQtdFilhos();
        }
        return media / list.size();
    }

    public double verificarMaiorSalario(List<Habitante> list) {
        double maior = 0;
        for (Habitante s : list) {
            if (s.getSalario() > maior) {
                maior = s.getSalario();
            }
        }
        return maior;
    }

    public double percentualSalarioAteCem(List<Habitante> list) {
        double contador = 0;
        for (Habitante s : list) {
            if (s.getSalario() <= 100) {
                contador++;
            }
        }

        return contador * list.size() / 100;
    }
}
