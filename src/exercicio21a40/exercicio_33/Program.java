package exercicio_33;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double pesoIdeal = 0;
		
		do {
			System.out.print("Informe a sua altura: ");
			double altura = sc.nextDouble();
			System.out.println("Informe seu sexo [M] ou [F]: ");
			char sexo = sc.next().charAt(0);

			if (sexo == 'M' || sexo == 'm') {
				pesoIdeal = (72.7 * altura) - 58;

			} else if (sexo == 'F' || sexo == 'f') {
				pesoIdeal = (62.1 * altura) - 44.7;

			} else {
				System.out.println("Sexo inválido, favor informa como [M] ou [F].");

			}
		} while (pesoIdeal == 0);

		System.out.printf("O seu peso ideal é de %.1f kg.", pesoIdeal);

		sc.close();
	}

}
