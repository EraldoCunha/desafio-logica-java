package exercicio61a80.exercicio_68;

import java.util.List;

public class Habitante {

    private String nome;
    private Integer idade;
    private Sexo sexo;
    private Double salario;

    public Habitante(String nome, Integer idade, Sexo sexo, Double salario) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.salario = salario;
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

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public static Double mediaSalarial(List<Habitante> lista) {
        double media = 0;
        for (Habitante s : lista) {
            media += s.getSalario();
        }
        return media / lista.size();
    }

    public static Integer menorIdade(List<Habitante> lista) {
        int menor = lista.get(0).getIdade();
        for (Habitante s : lista) {
            if (s.getIdade() <= menor) {
                menor = s.getIdade();
            }
        }
        return menor;
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

    public static Integer qtdMulheresAteCemReais(List<Habitante> lista) {
        int contador = 0;
        for (Habitante h : lista) {
            if (h.getSexo() == Sexo.F && h.getSalario() <= 100) {
                contador++;
            }
        }
        return contador;
    }
}
