package exercicio_19;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a largura do terreno: ");
		double larguraTerreno = sc.nextDouble();
		
		System.out.print("Informe o comprimento do terreno: ");
		double comprimentoTerreno = sc.nextDouble();
		
		double dimensaoTerreno = larguraTerreno * comprimentoTerreno;
		
		System.out.printf("A área do terreno é de: %.2fm²" , dimensaoTerreno);
		
		sc.close();
	}
}
