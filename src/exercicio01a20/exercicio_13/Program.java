package exercicio_13;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite as notas das 3 provas em sequ�ncia: ");
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double nota3 = sc.nextDouble();

		double mediaPonderada = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;

		System.out.printf("A m�dia ponderada das nota das provas � de: %.1f", mediaPonderada);

		sc.close();
	}
}
