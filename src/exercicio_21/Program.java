package exercicio_21;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		final double PRECO_PAO = 0.35;
		final double PRECO_BROA = 1.50;
		final double PERCENTUAL_POUPANCA = 10.0;

		System.out.print("Informe quantos pães franceses foram vendidos no dia: ");
		int qtdPaoFrancesVendido = sc.nextInt();

		System.out.print("Informe quantas broas foram vendidas no dia: ");
		int qtdBroaVendida = sc.nextInt();

		Double faturamentoDia = qtdPaoFrancesVendido * PRECO_PAO + qtdBroaVendida * PRECO_BROA;

		Double guardarPoupanca = (faturamentoDia * PERCENTUAL_POUPANCA) / 100;

		System.out.printf("O seu faturamento no dia foi de R$%.2f, guarde R$%.2f na poupança.", faturamentoDia,
				guardarPoupanca);

		sc.close();
	}
}
