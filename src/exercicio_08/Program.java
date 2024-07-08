package exercicio_08;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Informe uma data(DD/MM/AAAA): ");
		String data = sc.nextLine();
		
		String[] dataCompleta = data.split("/");
		int dia = Integer.parseInt(dataCompleta[0]);
		int mes = Integer.parseInt(dataCompleta[1]);
		
		int quantidadeDias = (mes - 1) * 30 + dia;
			
		System.out.println("Passaram ao todo " + quantidadeDias + " dias desde o início do ano.");
		
		
		sc.close();
	}

}
