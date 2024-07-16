package exercicio_16;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		final double descontoInss = 8.5;
		
		System.out.print("Informe seu nome: ");
		String nome = sc.nextLine();
		System.out.print(nome + " por gentileza informe seu sal�rio bruto para ser calculado: R$");
		double salarioBruto = sc.nextDouble();
		
		double desconto = (salarioBruto * descontoInss) / 100;
		double salarioLiquido = salarioBruto - desconto;
		
		System.out.printf("\nOl� %s, seu sal�rio l�quido � de R$%.2f, sendo descontado R$%.2f de INSS." , nome , salarioLiquido , desconto);
		
		sc.close();
	}

}
