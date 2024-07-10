package exercicio_10;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double precoPequena = 5.0;
		double precoMedia = 10.0;
		double precoGrande = 15.0;
		
		System.out.println("Olá, segue nossos preços: ");
		System.out.printf("Camiseta pequena = R$%.2f%n" , precoPequena);
		System.out.printf("Camiseta média = R$%.2f%n" , precoMedia);
		System.out.printf("Camiseta grande = R$%.2f%n" , precoGrande);
		
		System.out.println("\nFaça aqui o seu pedido de camisetas informando a quantidade delas que deseja adquirir: ");
		System.out.print("\nCamiseta pequena: ");
		int pedidoPequena = sc.nextInt();
		
		System.out.print("Camiseta média: ");
		int pedidoMedia = sc.nextInt();
		
		System.out.print("Camiseta grande: ");
		int pedidoGrande = sc.nextInt();
		
		double valorPedido = (precoPequena * pedidoPequena) + (precoMedia * pedidoMedia) + (precoGrande * pedidoGrande);
		
		System.out.printf("\nValor total do pedido = R$%.2f" , valorPedido);
		
		sc.close();
	}
}
