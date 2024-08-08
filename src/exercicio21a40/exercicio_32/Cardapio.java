package exercicio_32;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {

	private List<Item> cardapio;

	public Cardapio() {
		this.cardapio = new ArrayList<>();
	}

	public void adicionarItem(String nome, int codigo, double preco) {
		Item item = new Item(nome, codigo, preco);
		cardapio.add(item);
	}

	public double calcularUmItem(int codigo, int quantidade) {
		for (Item i : cardapio) {
			if (i.getCodigo() == codigo) {
				return i.getPreco() * quantidade;
			}
		}
		throw new IllegalArgumentException("Código não encontrado: " + codigo);
	}

	public Item buscarItem(int codigo) {
		for (Item i : cardapio) {
			if (i.getCodigo() == codigo) {
				return i;
			}
		}
		throw new IllegalArgumentException("Código não encontrado: " + codigo);
	}

	public void exibirItens() {
		if (!cardapio.isEmpty()) {
			System.out.println("Cardápio:");
			for (Item item : cardapio) {
				System.out.println(
						"Nome: " + item.getNome() + ", Código: " + item.getCodigo() + ", Preço: " + item.getPreco());
			}
		} else {
			System.out.println("O cardápio está vazio!");
		}
	}
}
