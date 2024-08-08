package exercicio_07;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double precoQuilo = 14.00;
		
		System.out.print("Informe o peso do prato do cliente: ");
		double pesoPrato = sc.nextDouble();
		
		System.out.printf("O valor a pagar é de R$%.2f." , (precoQuilo * pesoPrato));
			
		sc.close();
	}
}
