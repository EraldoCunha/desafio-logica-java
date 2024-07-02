package exercicio_02;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		
		System.out.println("Digite seu salário: ");
		double salario = sc.nextDouble();
		
		System.out.println("Nome= " + nome + "\nIdade= " + idade);
		System.out.printf("Salário= R$%.2f" , salario);
		
		sc.close();
	}

}
