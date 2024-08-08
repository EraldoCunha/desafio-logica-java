package exercicio_17;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int totalPrestacoes = 60;
		
		System.out.print("Informe a quantidade de prestações que ja foram pagas: ");
		int prestacoesPagas = sc.nextInt();
		
		System.out.print("Informe o valor pago da ultima prestação: R$");
		double valorPrestacao = sc.nextDouble();
		
		double totalPago = valorPrestacao * prestacoesPagas;
		double saldoDevedor = valorPrestacao * totalPrestacoes - totalPago;
		
		System.out.printf("\nO consorciado pagou R$%.2f, restam R$%.2f para ser pago." , totalPago , saldoDevedor);

		sc.close();
	}
}
