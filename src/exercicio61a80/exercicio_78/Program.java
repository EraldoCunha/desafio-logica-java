package exercicio61a80.exercicio_78;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        for (int i = 1; i <= 5; i++) {

            while (true) {
                System.out.print("Informe o valor de 'a': ");
                int a = sc.nextInt();

                System.out.print("Informe o valor de 'b': ");
                int b = sc.nextInt();

                if (a <= 0 || b <= 0) {
                    System.out.println("Apenas valores positivos serão aceitos!");
                } else if (a > b) {
                    System.out.println("O valor de 'a' não pode ser maior do que o valor de 'b'!");
                } else {
                    System.out.println("Inteiros positivos entre " + a + " e " + b);

                    boolean encontrouPar = false;
                    for(int j = a; j <= b; j++ ){
                        if(j % 2 == 0){
                            System.out.println(j);
                            encontrouPar = true;
                        }
                    }

                    if (!encontrouPar) {
                        System.out.println("Nenhum número par encontrado no intervalo.");
                    }
                    break;
                }

            }
        }

        sc.close();
    }
}
