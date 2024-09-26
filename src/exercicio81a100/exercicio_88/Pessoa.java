package exercicio81a100.exercicio_88;

public class Pessoa {

    private Sexo codigo;
    private Integer idade;
    private Double altura;

    public Pessoa(int codigo, Integer idade, Double altura) {
        this.codigo = verificarSexo(codigo);
        this.idade = idade;
        this.altura = altura;
    }

    public Sexo getCodigo() {
        return codigo;
    }

    public void setCodigo(Sexo codigo) {
        this.codigo = codigo;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    private Sexo verificarSexo(int codigo) {
        if (codigo == 0) {
            return Sexo.FEMININO;
        } else if (codigo == 1) {
            return Sexo.MASCULINO;
        } else {
            throw new RuntimeException("Código inválido");
        }
    }
}
