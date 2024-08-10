package exercicio_40;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a hora de inicio do jogo: ");
        int horaInicio = sc.nextInt();
        System.out.print("Informe a hora do final do jogo: ");
        int horaFim = sc.nextInt();

        int duracao;

        if (horaInicio < horaFim) {
            duracao = horaFim - horaInicio;
        } else if (horaInicio > horaFim) {
            duracao = (24 - horaInicio) + horaFim;
        } else {
            duracao = 24;
        }

        System.out.println("O jogo durou: " + duracao + " horas");

        sc.close();
    }

}
