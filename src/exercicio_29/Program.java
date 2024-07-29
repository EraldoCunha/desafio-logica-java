package exercicio_29;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a idade do nadador: ");
		int idade = sc.nextInt();
		
		if(idade >= 5 && idade <= 7) {
			System.out.print("Classificação = Infantil A");
		}else if(idade >= 8 && idade <= 10){
			System.out.print("Classificação = Infantil B");
		}else if(idade >= 11 && idade <= 13){
			System.out.print("Classificação = Juvenil A");;
		}else if(idade >= 14 && idade <= 17){
			System.out.print("Classificação = Juvenil B");
		}else if(idade >= 18){
			System.out.print("Classificação = Adulto");
		}else {
			System.out.println("Somente nadadores com 5 anos de idade ou mais podem ser classificados!");
		}
		
		sc.close();
	}

}
