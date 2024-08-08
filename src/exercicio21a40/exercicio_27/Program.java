package exercicio_27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o primeiro valor: ");
		double valor1 = sc.nextDouble();
		System.out.print("Informe o segundo valor: ");
		double valor2 = sc.nextDouble();
		System.out.print("Informe o terceiro valor: ");
		double valor3 = sc.nextDouble();
		
		List<Double> valores = new ArrayList<>(Arrays.asList(valor1, valor2 , valor3));
		
		System.out.print("Valores informados = ");
		for(Double v : valores) {
			System.out.printf("%.1f, " , v);
		}
		
		Collections.sort(valores);
		
		System.out.printf("\n\nO maior valor é %.1f" , valores.get(valores.size()-1));
		
		sc.close();
	}

}
