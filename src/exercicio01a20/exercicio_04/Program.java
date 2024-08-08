package exercicio_04;

public class Program {

	public static void main(String[] args) {

		int a = 5;
		int b = 10;

		System.out.println("Valores originais: " + "\nA = " + a + "\nB = " + b);

		int troca = a;
		a = b;
		b = troca;

		System.out.println("Valores após a troca: " + "\nA = " + a + "\nB = " + b);

	}

}