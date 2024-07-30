package exercicio_30;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe seu RA: ");
		long ra = sc.nextLong();
		
		System.out.println("Informe suas  três notas: ");
		double nota1 = sc.nextLong();
		double nota2 = sc.nextLong();
		double nota3 = sc.nextLong();

		Aluno aluno = new Aluno(ra, Arrays.asList(nota1, nota2, nota3));
		
		System.out.println(aluno);
		
		sc.close();
	}
}
