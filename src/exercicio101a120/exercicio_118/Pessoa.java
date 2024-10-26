package exercicio101a120.exercicio_118;

public class Pessoa {

    private Sexo sexo;
    private Double peso;
    private Double altura;
    private Double imc;

    public Pessoa(int sexo, Double peso, Double altura) {
        this.sexo = verificarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
        this.imc = calcularImc();
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getImc() {
        return imc;
    }

    public void setImc(Double imc) {
        this.imc = imc;
    }

    public Double calcularImc(){
        return getPeso() / Math.pow(getAltura(), 2);
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
