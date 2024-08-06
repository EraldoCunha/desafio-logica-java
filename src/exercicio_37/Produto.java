package exercicio_37;

public class Produto {

	private String codigo;
	private double preco;

	public Produto(String codigo, double preco) {
		this.codigo = codigo;
		this.preco = preco;
	}

	public String getCodigo() {
		return codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void imprimirProdutos() {
		System.out.printf("C�digo= %s, Pre�o = R$%.2f%n" , codigo , preco);
	}
}