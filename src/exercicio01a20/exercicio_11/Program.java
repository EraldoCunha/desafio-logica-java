package exercicio_11;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o valor de xA: ");
		double xA = sc.nextDouble();
		System.out.print("Entre com o valor de yA: ");
		double yA = sc.nextDouble();
		System.out.print("Entre com o valor de xB: ");
		double xB = sc.nextDouble();
		System.out.print("Entre com o valor de yB: ");
		double yB = sc.nextDouble();
		
		double distancia = Math.sqrt(Math.pow(xB - xA , 2) + Math.pow(yB - yA , 2));
		
		System.out.printf("Resultado: %.2f." , distancia);
		

		sc.close();
	}

}
