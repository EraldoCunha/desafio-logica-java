package exercicio_01;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Double nota1, nota2, media;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		System.out.printf("Média das nota: %.1f%n" , media);
		
		sc.close();
	}

}
