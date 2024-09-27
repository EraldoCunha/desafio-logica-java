package exercicio81a100.exercicio_89;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Cliente> clientes = new ArrayList<>();

        for(int i = 1; i <= 150; i++){
            System.out.print("Informe o nome do cliente: ");
            String nome = sc.nextLine();
            System.out.print("Informe o valor das compras do cliente no último ano: ");
            double valorCompras = sc.nextDouble();
            sc.nextLine();

            clientes.add(new Cliente(nome , valorCompras));
        }

        for(Cliente c : clientes){
            c.imprimirCliente();
        }

        sc.close();
    }
}
