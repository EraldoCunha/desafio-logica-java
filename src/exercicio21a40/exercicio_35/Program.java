package exercicio_35;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe os tres valores em sequencia: ");
		double valor1 = sc.nextDouble();
		double valor2 = sc.nextDouble();
		double valor3 = sc.nextDouble();

		boolean operacaoValida = false;
		double valorMedia = 0;
		String resultado = "";
		
		while (!operacaoValida) {
			System.out.println("Informe qual média deseja calcular:\n1 - Média Aritmética\n2 - Média Ponderada\n3 - Média Harmônica\n");
			int opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				valorMedia = mediaAritmetica(valor1, valor2, valor3);
				resultado = "A média aritmética é de ";
				operacaoValida = true;
				break;
			case 2:
				valorMedia = mediaPonderada(valor1, valor2, valor3);
				resultado = "A média ponderada é de ";
				operacaoValida = true;
				break;
			case 3:
				valorMedia = mediaHarmonica(valor1, valor2, valor3);
				resultado = "A média harmônica é de ";
				operacaoValida = true;
				break;
			default:
				System.out.println("\nOperação inválida.\n");
			}

			if (operacaoValida) {
				System.out.printf("\n%s%.2f", resultado, valorMedia);
			}
		}

		sc.close();
	}

	public static double mediaAritmetica(double a, double b, double c) {
		double media = (a + b + c) / 3;

		return media;
	}

	public static double mediaPonderada(double a, double b, double c) {
		double media = (a * 3 + b * 3 + c * 4) / 10;

		return media;
	}

	public static double mediaHarmonica(double a, double b, double c) {
		if (a == 0 || b == 0 || c == 0) {
			throw new IllegalArgumentException("Os valores para a média harmônica não podem ser zero.");
		}
		double somaReciprocals = (1.0 / a) + (1.0 / b) + (1.0 / c);
		return 3.0 / somaReciprocals;
	}
}
