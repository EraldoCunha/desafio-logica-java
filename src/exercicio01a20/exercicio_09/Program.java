package exercicio_09;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as 3 notas em sequência: ");
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double nota3 = sc.nextDouble();
		
		double mediaPonderada = (nota1 * 1 + nota2 * 2 + nota3 *3) / 6;
		
		System.out.printf("A média ponderada das nota é de: %.2f" , mediaPonderada);

		sc.close();
	}

}
