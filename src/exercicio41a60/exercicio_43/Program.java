package exercicio41a60.exercicio_43;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o percentual do IPI: ");
        double ipi = sc.nextDouble();
        System.out.print("Quantos tipos de peças deseja comprar?");
        int quantidadePecas = sc.nextInt();
        List<Pedido> pedidos = new ArrayList<>();
        double valorTotal = 0;

        for (int i = 1; i <= quantidadePecas; i++) {
            System.out.print("\nInforme o código da " + i + "ª peça: ");
            int codigo = sc.nextInt();
            System.out.print("Informe o valor unitário da " + i + "ª peça: ");
            double preco = sc.nextDouble();
            System.out.print("Informe quantas dessas peças deseja comprar: ");
            int quantidade = sc.nextInt();

            pedidos.add(new Pedido(quantidade , new Peca(codigo, preco)));
        }

        for(Pedido p: pedidos){
            valorTotal += p.getQuantidade() * p.getPeca().getPreco();
        }

        valorTotal *= (ipi /100) +1;

        System.out.printf("\nO valor total do pedido é de R$%.2f" , valorTotal);

        sc.close();
    }
}
