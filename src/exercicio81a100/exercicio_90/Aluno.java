package exercicio81a100.exercicio_90;

public class Aluno {

    private Integer matricula;
    private Double notaFinal;
    private Conceito conceito;

    public Aluno(Integer matricula, Double notaFinal) {
        this.matricula = matricula;
        this.notaFinal = notaFinal;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(Double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public Conceito getConceito() {
        return conceito;
    }

    public void setConceito(Conceito conceito) {
        this.conceito = conceito;
    }

    public void imprimirAlunos(){
        System.out.printf("%nAluno matrícula: %d , Nota Final: %.2f , Conceito: %s" , getMatricula(), getNotaFinal(), getConceito());
    }
}
