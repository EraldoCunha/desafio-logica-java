package exercicio_34;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe seu saldo m�dio no ultimo ano: ");
		double saldoMedio = sc.nextDouble();
		String credito;

		switch ((int) ((saldoMedio - 1) / 200)) {
		case 0:
			credito = "nenhum cr�dito";
			break;
		case 1:
			credito = "20% do valor do saldo m�dio";
			break;
		case 2:
		case 3:
			if (saldoMedio > 600) {
				credito = "40% do valor do saldo m�dio";
			} else {
				credito = "30% do valor do saldo m�dio";
			}
			break;
		default:
			credito = "40% do valor do saldo m�dio";
			break;
		}

		System.out.printf("Seu saldo m�dio foi de R$%.2f%nVoc� ter� direito a %s", saldoMedio, credito);

		sc.close();
	}

}
