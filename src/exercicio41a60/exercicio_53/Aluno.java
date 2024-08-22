package exercicio41a60.exercicio_53;

public class Aluno {

    private Integer codigo;
    private Double nota1;
    private Double nota2;
    private Double nota3;
    private Double media;

    public Aluno(Integer codigo, Double nota1, Double nota2, Double nota3) {
        this.codigo = codigo;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.media = calcularMedia(nota1, nota2, nota3);
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getNota1() {
        return nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public Double getNota3() {
        return nota3;
    }

    public Double getMedia() {
        return media;
    }

    public Double calcularMedia(Double nota1, Double nota2, Double nota3){
        return (nota1 + nota2 + nota3) / 3;
    }

    public void imprimirAluno(){
        System.out.printf("%nAluno código: %d, ficou com a média de %.1f%n" , getCodigo(), getMedia());
    }
}
