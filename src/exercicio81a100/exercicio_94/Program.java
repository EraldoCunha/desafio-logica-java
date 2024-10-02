package exercicio81a100.exercicio_94;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b;

        while(true){
            System.out.print("Informe o primeiro número: ");
            a = sc.nextDouble();

            System.out.print("Informe o segundo número: ");
            b = sc.nextDouble();

            if(a != b){
                break;
            }else{
                System.out.println("Os números não podem ser iguais!");
            }
        }

        double diferenca = Math.abs(b - a);

        double intervalo = diferenca / 3;

        System.out.printf("O valor dos interválos é de: %.2f" , intervalo);

        sc.close();
    }
}
