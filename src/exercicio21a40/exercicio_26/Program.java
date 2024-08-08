package exercicio_26;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a primeira nota: ");
		double nota1 = sc.nextDouble();
		System.out.print("Informe a segunda nota: ");
		double nota2 = sc.nextDouble();
		System.out.print("Informe a terceira nota: ");
		double nota3 = sc.nextDouble();
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		String resultado = media >= 6 ? "aprovado" : "reprovado";
		
		System.out.printf("Média = %.1f, você está %s." , media , resultado);
		
		
		sc.close();
	}
}