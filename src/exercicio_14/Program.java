package exercicio_14;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double saldoConta = 500d;

		System.out.print("Digite o valor do chege à compensar: R$");
		double chequeCompensar = sc.nextDouble();

		//Lógica para não permitir que o saldo fique negativo.
		if (chequeCompensar > saldoConta) {
			System.out.printf("\nSaldo insuficiente para concluir a operação. \nSeu saldo atual é de R$%.2f" , saldoConta);
		} else {
			saldoConta -= chequeCompensar;
			System.out.printf("\nSeu novo saldo é de: R$%.2f", saldoConta);
		}

		sc.close();
	}

}
