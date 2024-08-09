package exercicio_39;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor de A: ");
        int a = sc.nextInt();
        System.out.print("Informe o valor de B: ");
        int b = sc.nextInt();
        System.out.print("Informe o valor de C: ");
        int c = sc.nextInt();


        if((a + b) > c && (a + c) > b && (b + c) > a){
            int semiperimetro = (a+ b + c )/ 2;
            double area = Math.sqrt(semiperimetro * (semiperimetro - a) * (semiperimetro - b) *(semiperimetro - c));
            System.out.printf("A área do triângulo é de %.2f" , area);
        } else {
            System.out.println("Os valores " + a + ", " + b + " e " + c + " não formam um triângulo.");
        }

        sc.close();
    }
}
