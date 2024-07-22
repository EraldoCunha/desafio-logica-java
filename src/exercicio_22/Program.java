package exercicio_22;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe sua idade no formato (dd,mm,aa): ");
		String idadeInformada = sc.nextLine();
		
		String[] idadeVetor = idadeInformada.split(",");
		
		int dia = Integer.parseInt(idadeVetor[0]);
		int mes = Integer.parseInt(idadeVetor[1]);
		int ano = Integer.parseInt(idadeVetor[2]);
		
		//Consideraremos que um mês tem 30 dias e um ano tem 360 dias.
		if(dia <= 30 && dia >= 0 && mes <= 11 && mes >= 0 && ano >= 0) {
			
			int diasTotais = dia + (mes * 30) + (ano * 360);
			
			System.out.println("Você tem " + diasTotais + " dias de vida.");
		} else {
			
			System.out.println("Idade inválida. Certifique-se de que os dias estejam entre 0 e 30 e os meses entre 0 e 11.");
		}

		sc.close();
	}
}
