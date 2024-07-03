package exercicio_3;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		Double numero1 = sc.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		Double numero2 = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Soma = %.2f%n" , (numero1 + numero2));
		System.out.printf("Subtração = %.2f%n" , (numero1 - numero2));
		System.out.printf("Multiplicação = %.2f%n" , (numero1 * numero2));
		System.out.printf("Divisão = %.2f%n" , (numero1 / numero2));

		sc.close();
	}

}
