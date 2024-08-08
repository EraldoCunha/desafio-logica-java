package exercicio_06;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite qual é o preço do litro de gasolina: ");
		double precoGasolina = sc.nextDouble();
		
		System.out.print("Digite qual o valor que deseja abastecer: ");
		double valorAbastecimento = sc.nextDouble();
		
		double quantidadeAbastecida = valorAbastecimento / precoGasolina;
		
		System.out.printf("\nVocê abasteceu %.2f litros de gasolina. Volte sempre!" , quantidadeAbastecida);
		
		sc.close();
	}
}
