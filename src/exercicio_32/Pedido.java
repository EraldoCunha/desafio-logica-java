package exercicio_32;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private List<Item> itens;

	public Pedido() {
		super();
		this.itens = new ArrayList<>();
	}

	public void adicionarItem(Item item, int quantidade) {
		for (int i = 0; i < quantidade; i++) {
			itens.add(item);
		}
	}

	public double calcularTotal() {
		double total = 0;
		for (Item i : itens) {
			total += i.getPreco();
		}
		return total;
	}

	public void exibirPedido() {
		if (!itens.isEmpty()) {
			for (Item item : itens) {
				System.out.println(item);
			}
		} else {
			System.out.println("O pedido está vazio!");
		}
	}

}
