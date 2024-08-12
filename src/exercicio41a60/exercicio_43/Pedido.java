package exercicio41a60.exercicio_43;

public class Pedido {

    private int quantidade;
    private Peca peca;

    public Pedido(int quantidade, Peca peca) {
        this.quantidade = quantidade;
        this.peca = peca;
    }

    public int getQuantidade() {
        return quantidade;
    }


    public Peca getPeca() {
        return peca;
    }

}
