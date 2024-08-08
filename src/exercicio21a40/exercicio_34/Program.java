package exercicio_34;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe seu saldo médio no ultimo ano: ");
		double saldoMedio = sc.nextDouble();
		String credito;

		switch ((int) ((saldoMedio - 1) / 200)) {
		case 0:
			credito = "nenhum crédito";
			break;
		case 1:
			credito = "20% do valor do saldo médio";
			break;
		case 2:
		case 3:
			if (saldoMedio > 600) {
				credito = "40% do valor do saldo médio";
			} else {
				credito = "30% do valor do saldo médio";
			}
			break;
		default:
			credito = "40% do valor do saldo médio";
			break;
		}

		System.out.printf("Seu saldo médio foi de R$%.2f%nVocê terá direito a %s", saldoMedio, credito);

		sc.close();
	}

}
