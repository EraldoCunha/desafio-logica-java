package exercicio41a60.exercicio_44;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a hora de inicio do jogo : ");
        int horaInicio = sc.nextInt();
        System.out.print("Informe os minutos de inicio do jogo : ");
        int minutosInicio = sc.nextInt();

        System.out.print("Informe a hora de fim do jogo : ");
        int horaFim = sc.nextInt();
        System.out.print("Informe os minutos de fim do jogo : ");
        int minutosFim = sc.nextInt();

        int inicioEmMinutos = horaInicio * 60 + minutosInicio;
        int fimEmMinutos = horaFim * 60 + minutosFim;

        int duracaoEmMinutos;

        if (inicioEmMinutos < fimEmMinutos) {
            duracaoEmMinutos = fimEmMinutos - inicioEmMinutos;
        } else {
            duracaoEmMinutos = (24 * 60 - inicioEmMinutos) + fimEmMinutos;
        }

        int duracaoHoras = duracaoEmMinutos / 60;
        int duracaoMinutos = duracaoEmMinutos % 60;

        System.out.printf("A duração do jogo foi de %d horas e %d minutos.%n", duracaoHoras, duracaoMinutos);

        sc.close();
    }



}