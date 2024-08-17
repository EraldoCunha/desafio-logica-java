package exercicio41a60.exercicio_48;

import java.util.ArrayList;
import java.util.List;

public class Senso {

    private List<Habitante> habitantes = new ArrayList<>();

    public Senso() {
    }

    public Senso(List<Habitante> habitantes) {
        this.habitantes = habitantes;
    }

    public List<Habitante> getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(List<Habitante> habitantes) {
        this.habitantes = habitantes;
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

        return contador / list.size() * 100;
    }
}