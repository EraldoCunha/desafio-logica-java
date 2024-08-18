package exercicio41a60.exercicio_49;

public class Pessoa {

    private String nome;
    private double altura;
    private double crescimentoAnual;

    public Pessoa(String nome, double altura, double crescimentoAnual) {
        this.nome = nome;
        this.altura = altura;
        this.crescimentoAnual = crescimentoAnual;
    }

    public String getNome() {
        return nome;
    }

    public double getAltura() {
        return altura;
    }

    public double getCrescimentoAnual() {
        return crescimentoAnual;
    }

    public void acrescentarAltura() {
        altura += crescimentoAnual;
    }
}
