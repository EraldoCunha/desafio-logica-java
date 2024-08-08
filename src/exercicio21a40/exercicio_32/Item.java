package exercicio_32;

public class Item {

	private String nome;
	private int codigo;
	private double preco;
	
	public Item(String nome, int codigo, double preco) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public double getPreco() {
		return preco;
	}

	@Override
	public String toString() {
		return "Item [nome=" + nome + ", codigo=" + codigo + ", preco=" + preco + "]";
	}

}
