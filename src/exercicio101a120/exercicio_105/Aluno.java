package exercicio101a120.exercicio_105;

import java.util.Arrays;

public class Aluno {

    private Status status;
    private Integer acertos = 0;
    private char[] respostas = new char[10];

    public Aluno() {
    }

    public Aluno(char[] vetor, char[] respostas) {
        this.status = verificarStatus();
        this.acertos = verificarAcertos(vetor);
        this.respostas = respostas;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Integer getAcertos() {
        return acertos;
    }

    public void setAcertos(Integer acertos) {
        this.acertos = acertos;
    }

    public char[] getRespostas() {
        return respostas;
    }

    public void setRespostas(char[] respostas) {
        this.respostas = respostas;
    }

    public Status verificarStatus() {

        if (acertos >= 6) {
            return Status.APROVADO;
        } else {
            return Status.REPROVADO;
        }
    }

    public Integer verificarAcertos(char[] vetor) {
        int contadorAcertos = 0;
        for (int i = 0; i < 10; i++) {
            if (respostas[i] == vetor[i]) {
                contadorAcertos++;
            }
        }
        return contadorAcertos;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "status=" + status +
                ", acertos=" + acertos +
                ", respostas=" + Arrays.toString(respostas) +
                '}';
    }
}
