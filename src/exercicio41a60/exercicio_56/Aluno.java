package exercicio41a60.exercicio_56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static exercicio41a60.exercicio_56.SituacaoAcademica.APROVADO;
import static exercicio41a60.exercicio_56.SituacaoAcademica.REPROVADO;

public class Aluno {

    private int codigoAluno;
    private double nota1;
    private double nota2;
    private double nota3;
    private double media;
    private SituacaoAcademica situacaoAcademica;

    public Aluno(){
    }

    public Aluno(int codigoAluno, double nota1, double nota2, double nota3) {
        this.codigoAluno = codigoAluno;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.media = vericicarMedia();
        this.situacaoAcademica = verificarSituacacaoAcademica();
    }

    public int getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(int codigoAluno) {
        this.codigoAluno = codigoAluno;
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

    public double vericicarMedia(){
        List<Double> notas = new ArrayList<>(Arrays.asList(nota1, nota2, nota3));
        Collections.sort(notas);
        return (notas.get(2) * 4 + notas.get(1) * 3 + notas.get(0) * 3) / 10;
    }

    public SituacaoAcademica verificarSituacacaoAcademica(){
        if (getMedia() >= 5){
            return APROVADO;
        }else {
            return REPROVADO;
        }
    }

    public void imprimirAluno(){
        System.out.printf("%nCódigo: %d%nNota 1: %.1f%nNota 2: %.1f%nNota 3: %.1f%nMedia: %.1f%nSituação Acadêmica: %s%n"
        , codigoAluno, nota1, nota2, nota3, media, situacaoAcademica);
    }
}
