package exercicio_23;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a sua idade em dias: ");
		int totalDias = sc.nextInt();

		int dias, meses, anos;

		// Consideraremos que os meses terão 30 dias e que o ano terá 360 dias.
		anos = totalDias / 360;
		meses = (totalDias % 360) / 30;
		dias = totalDias % 30;

		System.out.println("\nVocê tem " + anos + " anos, " + meses + " meses e " + dias + " dias de idade.");

		sc.close();
	}
}
