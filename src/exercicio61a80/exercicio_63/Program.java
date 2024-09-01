package exercicio61a80.exercicio_63;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Para encerrar digite um valor negativo");
        while(true){

            System.out.print("Informe o valor de m: ");
            int m = sc.nextInt();
            System.out.print("Informe o valor de n: ");
            int n = sc.nextInt();

            if(m < 0 || n < 0){
                break;
            }

            List<Integer> lista = new ArrayList<>();
            for(int i = 1; i <= n; i++){
                lista.add(m);
                m++;
            }

            int soma = 0;
            for(Integer v : lista){
                soma += v;
                System.out.print(v + ", ");
            }
            System.out.println("Soma = " + soma);
        }

        sc.close();
    }
}
