package exercicio41a60.exercicio_52;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Candidato> votacoes = new ArrayList<>(Arrays.asList(
                new Candidato(1, "Candidato A")
                , new Candidato(2, "Candidato B")
                , new Candidato(3, "Candidato C")
                , new Candidato(4, "Candidato D")
                , new Candidato(5, "Voto Nulo")
                , new Candidato(6, "Voto em Branco")
        ));

        int voto;

        do {
            System.out.println("\nInsira seu voto aqui:");

            for (Candidato candidato : votacoes) {
                System.out.println(candidato);
            }

            System.out.println("Digite 0 para encerrar a votação");

            voto = sc.nextInt();

            switch (voto) {
                case 0:
                    System.out.println("\nEncerrando votação...");
                    break;
                case 1:
                    votacoes.get(0).adicionarVoto();
                    break;
                case 2:
                    votacoes.get(1).adicionarVoto();
                    break;
                case 3:
                    votacoes.get(2).adicionarVoto();
                    break;
                case 4:
                    votacoes.get(3).adicionarVoto();
                    break;
                case 5:
                    votacoes.get(4).adicionarVoto();
                    break;
                case 6:
                    votacoes.get(5).adicionarVoto();
                    break;
                default:
                    System.out.print("\nVoto inválido, favor votar em uma das opções válidas.\n\n");
                    break;
            }
        } while (voto != 0);


        System.out.print("\nResultado das votações: ");
        for (Candidato v : votacoes) {
            System.out.println(v.getNome() + " recebeu " + v.getVotosRecebidos() + " votos.");
        }

        sc.close();
    }
}
