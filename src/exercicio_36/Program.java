package exercicio_36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Produto> produtos = new ArrayList<>(Arrays.asList(new Produto(1001, 5.32), new Produto(1324, 6.45),
				new Produto(6548, 2.37), new Produto(987, 5.32), new Produto(7623, 6.45)));

		System.out.println("Produtos: " + produtos);

		System.out.print("\nInforme o código do produto comprado: ");
		int codigoProdutoComprado = sc.nextInt();
		System.out.print("Informe a quantidade do produto comprado: ");
		int quantidadeProdutoComprado = sc.nextInt();

		double precoTotal = 0;

		for (Produto p : produtos) {
			if (p.getCodigo() == codigoProdutoComprado) {
				precoTotal = p.getPreco() * quantidadeProdutoComprado;
			}
		}

		if (precoTotal == 0) {
			System.out.println("\nNumero de código ou quantidade inválida.");
		} else {
			System.out.printf("\nO preço total dos produtos é de R$%.2f.", precoTotal);
		}

		sc.close();
	}

}
