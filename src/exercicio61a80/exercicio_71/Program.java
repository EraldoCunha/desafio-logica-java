package exercicio61a80.exercicio_71;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Produto> produtos = new ArrayList<>();

        Produto produto;

        do{
            System.out.print("Informe o código do produto: ");
            int codigo = sc.nextInt();
            if(codigo < 0){
                break;
            }
            System.out.print("Informe o preço do produto: R$");
            double preco = sc.nextDouble();

            Produto prod = new Produto(codigo, preco);
            produtos.add(prod);

        }while(true);

        System.out.println();
        Produto.imprimirLista(produtos);

        sc.close();
    }
}
