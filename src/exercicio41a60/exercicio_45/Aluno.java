package exercicio41a60.exercicio_45;

import java.util.List;

public class Aluno {

    private int identificacao;
    private List<Double> notas;
    private double mediaExercicios;
    private double mediaAproveitamento;
    private char conceito;
    private final String aprovacao;

    public Aluno(int identificacao, List<Double> notas, double mediaExercicios) {
        this.identificacao = identificacao;
        this.notas = notas;
        this.mediaExercicios = mediaExercicios;
        this.mediaAproveitamento = calcularMediaDeAproveitamento();
        this.conceito = atribuirConceito();
        this.aprovacao = verificarAprovacao();
    }

    public int getIdentificacao() {
        return identificacao;
    }


    public List<Double> getNotas() {
        return notas;
    }


    public double getMediaExercicios() {
        return mediaExercicios;
    }


    public double getMediaAproveitamento() {
        return mediaAproveitamento;
    }

    public char getConceito() {
        return conceito;
    }

    public String getAprovacao() {
        return aprovacao;
    }

    public double calcularMediaDeAproveitamento(){
        return (getNotas().get(0) + getNotas().get(1) * 2 + getNotas().get(2) * 3 + getMediaExercicios()) / 7;
    }

    public char atribuirConceito (){
        char conceito;

        if(getMediaAproveitamento() >= 9){
            conceito = 'A';
            return conceito;
        }
        if (getMediaAproveitamento() >= 7.5){
            conceito = 'B';
            return conceito;
        }
        if (getMediaAproveitamento() >= 6){
            conceito = 'C';
            return conceito;
        }
        if (getMediaAproveitamento() >= 4){
            conceito = 'D';
            return conceito;
        } else {
            conceito = 'E';
            return conceito;
        }
    }

    public String verificarAprovacao(){
        if(conceito == 'A' ||conceito == 'B' || conceito == 'C' ){
            return "APROVADO";
        } else{
            return "REPROVADO";
        }
    }

    @Override
    public String toString() {
        return "\nAluno:\n" +
                "Identificacao= " + identificacao +
                ", \nNotas= " + notas +
                ", \nMédia dos exercicios= " + mediaExercicios +
                ", \nMédia de aproveitamento= " + String.format("%.2f", mediaAproveitamento) +
                ", \nConceito= " + conceito +
                ", \nAprovacao= " + aprovacao;
    }
}
