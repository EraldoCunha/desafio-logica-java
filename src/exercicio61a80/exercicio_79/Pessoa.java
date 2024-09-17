package exercicio61a80.exercicio_79;

public class Pessoa {

    private Double altura;
    private Sexo codigo;

    public Pessoa(Double altura, int codigo) {
        this.altura = altura;
        this.codigo = verificarSexo(codigo);
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Sexo getCodigo() {
        return codigo;
    }

    public void setCodigo(Sexo codigo) {
        this.codigo = codigo;
    }

    private Sexo verificarSexo(int codigo) {
        if (codigo == 1) {
            return Sexo.MASCULINO;
        } else if (codigo == 2) {
            return Sexo.FEMININO;
        } else {
            throw new RuntimeException("Código inválido");
        }
    }
}
