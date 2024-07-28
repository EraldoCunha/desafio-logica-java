package exercicio_28;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o primeiro numero: ");
		int primeiroNumero = sc.nextInt();
		System.out.print("Informe o segundo numero: ");
		int segundoNumero = sc.nextInt();
		
		if(primeiroNumero % segundoNumero == 0 || segundoNumero % primeiroNumero == 0) {
			System.out.println("São múltiplos");
		} else {
			System.out.println("Não são múltiplos");
		}
		
		sc.close();
	}
}
