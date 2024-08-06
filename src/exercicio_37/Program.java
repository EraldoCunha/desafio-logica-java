package exercicio_37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Produto> produtos = new ArrayList<>(Arrays.asList(new Produto("ABCD", 5.30), new Produto("XYPK", 6.00),
				new Produto("KLMP", 3.20), new Produto("QRST", 2.50)));

		System.out.println("Produtos:");
		for(Produto p : produtos) {
			p.imprimirProdutos();
		}

		System.out.print("\nInforme o código do produto comprado: ");
		String codigoProdutoComprado = sc.nextLine();
		System.out.print("Informe a quantidade do produto comprado: ");
		int quantidadeProdutoComprado = sc.nextInt();

		double precoTotal = 0;
		boolean codigoValido = false;

		for (Produto p : produtos) {
			if (p.getCodigo().equalsIgnoreCase(codigoProdutoComprado)) {
				precoTotal = p.getPreco() * quantidadeProdutoComprado;
				codigoValido = true;
				break;
			}
		}

		if (!codigoValido) {
			System.out.println("\nCódigo inválido!");
		} else {
			System.out.printf("\nO preço total dos produtos é de R$%.2f.", precoTotal);
		}

		sc.close();
	}

}