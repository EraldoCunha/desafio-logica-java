package exercicio_25;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe quantos segundos dura o evento da fábrica: ");
		int segundosTotais = sc.nextInt();

		int horas, minutos, segundos;

		horas = segundosTotais / 3600;
		minutos = (segundosTotais % 3600) / 60;
		segundos = segundosTotais % 60;

        System.out.println(String.format("\nO evento leva %02d:%02d:%02d para ser concluído.", horas, minutos, segundos));

		sc.close();
	}
}