package exercicio_12;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de dias sem acidentes: ");
		int totalDias = sc.nextInt();
		
		int dias, meses, anos;
		
		//Consideraremos que o ano terá 360 dias já que os meses terão 30 dias conforme o enunciado.
		anos = totalDias/360;
		meses = (totalDias % 360) / 30;
		dias = totalDias % 30;
		
		System.out.println("\nSe passaram " + anos + " anos, " + meses + " meses e " + dias + " dias sem acidentes.");
		
		sc.close();
	}

}
