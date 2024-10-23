package exercicio101a120.exercicio_115;

public class Cliente {

    private Long id;
    private Integer qtdLocacao;
    private Integer qtdLocacaoGratis;

    public Cliente(Long id, Integer qtdLocacao) {
        this.id = id;
        this.qtdLocacao = qtdLocacao;
        this.qtdLocacaoGratis = qtdLocacao / 10;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQtdLocacao() {
        return qtdLocacao;
    }

    public void setQtdLocacao(Integer qtdLocacao) {
        this.qtdLocacao = qtdLocacao;
    }

    public Integer getQtdLocacaoGratis() {
        return qtdLocacaoGratis;
    }

    public void setQtdLocacaoGratis(Integer qtdLocacaoGratis) {
        this.qtdLocacaoGratis = qtdLocacaoGratis;
    }
}
