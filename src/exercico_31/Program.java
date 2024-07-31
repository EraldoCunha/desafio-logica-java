package exercico_31;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um número inteiro: ");
		int numero = sc.nextInt();
		
		String parImpar = numero % 2 == 0 ? "par" : "impar";
		
		String positivoNegativo;
		if(numero > 0) {
			positivoNegativo = "positivo";
		}else if(numero < 0){
			positivoNegativo = "negativo";
		}else {
			positivoNegativo = "neutro";
		}
		
		System.out.println("\nO número digitado é " + parImpar + " e " + positivoNegativo + ".");
		
		sc.close();
	}
}
