package exercicio81a100.exercicio_85;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor inteiro e positivo para o cálculo: ");

        int h;
        while(true){
            int n = sc.nextInt();

            if(n > 0){
                h = 10 * n;
                break;
            } else{
                System.out.println("\nApenas um valor inteiro e positivo será aceito, tente novamente.");
            }
        }

        System.out.println("A soma H é: " + h);

        sc.close();
    }
}
