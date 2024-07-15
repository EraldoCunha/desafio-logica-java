package exercicio_15;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		final double salarioBase = 800d;
		final double comissao = 15d;

		System.out.print("Informe o seu valor de venda nesse mês: R$");
		double vendas = sc.nextDouble();

		double salarioTotal = ((vendas * comissao) / 100) + salarioBase;

		System.out.printf("Seu salário é de: R$%.2f", salarioTotal);

		sc.close();
	}
}