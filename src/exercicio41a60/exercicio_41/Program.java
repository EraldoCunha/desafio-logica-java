package exercicio41a60.exercicio_41;

import java.util.*;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número de 1 a 3: ");
        int i = sc.nextInt();
        System.out.println("Informe o valor de a: ");
        double a = sc.nextDouble();
        System.out.println("Informe o valor de b: ");
        double b = sc.nextDouble();
        System.out.println("Informe o valor de c: ");
        double c = sc.nextDouble();

        List<Double> lista = new ArrayList<>(Arrays.asList(a, b, c));

        switch (i) {
            case 1:
                Collections.sort(lista);
                System.out.println(lista);

                break;
            case 2:
                Collections.sort(lista);
                Collections.reverse(lista);
                System.out.println(lista);

                break;
            case 3:
                Collections.sort(lista);
                double maior = lista.remove(2);
                double meio = lista.remove(1);
                lista.add(1, maior);
                lista.add(2, meio);
                System.out.println(lista);

                break;
            default:
                System.out.println("Valor de 'i' inválido!");

                break;
        }


        sc.close();
    }
}
