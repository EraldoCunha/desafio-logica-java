package exercicio_05;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double imposto = 0.45;
		double lucro = 0.25;
		
		System.out.print("Digite o valor do custo que a fábrica tem ao fabricar um carro novo: ");
		double custoFabrica = sc.nextDouble();
		
		double valorFinal = (custoFabrica * imposto) + (custoFabrica * lucro) + custoFabrica;
		
		System.out.printf("O consumidor pagará R$%.2f pelo carro novo." , valorFinal);

		sc.close();
	}

}
