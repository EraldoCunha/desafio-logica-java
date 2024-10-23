package exercicio101a120.exercicio_115;

import java.util.Random;

public class Program {

    public static void main(String[] args) {
        Cliente[] clientes = new Cliente[50];
        Random random = new Random();

        for (int i = 0; i < clientes.length; i++) {
            int qtdLocacao = random.nextInt(101);
            clientes[i] = new Cliente((long) (i + 1), qtdLocacao);
        }

        for (Cliente cliente : clientes) {
            System.out.println("Cliente ID: " + cliente.getId() +
                    ", Filmes alugados: " + cliente.getQtdLocacao() +
                    ", Locações gratuitas: " + cliente.getQtdLocacaoGratis());
        }
    }
}
