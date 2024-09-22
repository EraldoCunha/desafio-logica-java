package exercicio81a100.exercicio_84;

public class Aluno {

    private double nota1;
    private double nota2;
    private double nota3;
    private double media;
    private SituacaoAcademica situacaoAcademica;

    public Aluno(){
    }

    public Aluno(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.media = AlunoUtil.vericicarMedia(this.nota1, this.nota2, this.nota3);
        this.situacaoAcademica = AlunoUtil.verificarSituacacaoAcademica(this.media);
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public SituacaoAcademica getSituacaoAcademica() {
        return situacaoAcademica;
    }

    public void setSituacaoAcademica(SituacaoAcademica situacaoAcademica) {
        this.situacaoAcademica = situacaoAcademica;
    }
}
