package exercicio_20;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final Integer ferradurasPorCavalo = 4;
		
		System.out.print("Informe quantos cavalos foram comprados: ");
		int qtdCavalosComprados = sc.nextInt();
		
		int ferradurasNecessarias = qtdCavalosComprados * ferradurasPorCavalo;
		
		System.out.println("\nSer�o necess�rrias " + ferradurasNecessarias + " ferraduras para equipar todos os cavalos comprados.");
		
		sc.close();
	}

}
