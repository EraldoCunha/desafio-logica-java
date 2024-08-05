package exercicio_36;

public class Produto {

	private int codigo;
	private double preco;
	
	public Produto(int codigo, double preco) {
		this.codigo = codigo;
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public double getPreco() {
		return preco;
	}

	@Override
	public String toString() {
		return "\nCódigo= " + codigo + ", Preço= " + preco + "";
	}
	
	
}
