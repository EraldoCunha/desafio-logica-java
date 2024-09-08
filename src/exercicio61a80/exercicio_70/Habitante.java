package exercicio61a80.exercicio_70;

import java.util.List;

public class Habitante {

    private String nome;
    private Integer idade;
    private Sexo sexo;
    private CorOlhos corOlhos;
    private CorCabelo corCabelo;

    public Habitante(String nome, Integer idade, Sexo sexo, CorOlhos corOlhos, CorCabelo corCabelo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.corOlhos = corOlhos;
        this.corCabelo = corCabelo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public CorOlhos getCorOlhos() {
        return corOlhos;
    }

    public void setCorOlhos(CorOlhos corOlhos) {
        this.corOlhos = corOlhos;
    }

    public CorCabelo getCorCabelo() {
        return corCabelo;
    }

    public void setCorCabelo(CorCabelo corCabelo) {
        this.corCabelo = corCabelo;
    }

    public static Integer maiorIdade(List<Habitante> lista) {
        int maior = lista.get(0).getIdade();
        for (Habitante s : lista) {
            if (s.getIdade() >= maior) {
                maior = s.getIdade();
            }
        }
        return maior;
    }

    public static Integer qtdMulheresQuestaoF(List<Habitante> lista) {
        int contador = 0;
        for (Habitante h : lista) {
            if (h.getSexo() == Sexo.F
                    && h.getIdade() >= 18
                    && h.getIdade() <= 35
                    && h.getCorOlhos() == CorOlhos.VERDE
                    && h.getCorCabelo() == CorCabelo.LOIRO) {
                contador++;
            }
        }
        return contador;
    }
}
