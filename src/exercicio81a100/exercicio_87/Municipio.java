package exercicio81a100.exercicio_87;

public class Municipio {

    private Integer codigo;
    private Estado estado;
    private Integer qtdVeiculos;
    private Integer qtdAcidentes;

    public Municipio(Integer codigo, Estado estado, Integer qtdVeiculos, Integer qtdAcidentes) {
        this.codigo = codigo;
        this.estado = estado;
        this.qtdVeiculos = qtdVeiculos;
        this.qtdAcidentes = qtdAcidentes;
    }

    public Municipio(Municipio municipio) {
        codigo = municipio.getCodigo();
        estado = municipio.getEstado();
        qtdVeiculos = municipio.getQtdVeiculos();
        qtdAcidentes = municipio.getQtdAcidentes();
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Integer getQtdVeiculos() {
        return qtdVeiculos;
    }

    public void setQtdVeiculos(Integer qtdVeiculos) {
        this.qtdVeiculos = qtdVeiculos;
    }

    public Integer getQtdAcidentes() {
        return qtdAcidentes;
    }

    public void setQtdAcidentes(Integer qtdAcidentes) {
        this.qtdAcidentes = qtdAcidentes;
    }
}
