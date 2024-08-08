package exercicio_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o valor de A: ");
		double a = sc.nextDouble();

		System.out.print("Informe o valor de B: ");
		double b = sc.nextDouble();
		System.out.println();
		
		List<Double> ordenador = new ArrayList<>(Arrays.asList(a , b));
		Collections.sort(ordenador);
		
		for(Double n : ordenador) {
			System.out.print(n + "  ");
		}
		
		sc.close();
	}
}