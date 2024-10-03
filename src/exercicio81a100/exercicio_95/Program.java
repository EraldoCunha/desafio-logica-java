package exercicio81a100.exercicio_95;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Informe a primeira data (DD/MM/AAAA): ");
        String data1 = sc.nextLine();

        System.out.print("Informe a segunda data (DD/MM/AAAA): ");
        String data2 = sc.nextLine();

        LocalDate dataInicial = LocalDate.parse(data1, formatter);
        LocalDate dataFinal = LocalDate.parse(data2, formatter);

        long diasDiferenca = ChronoUnit.DAYS.between(dataInicial, dataFinal);

        System.out.println("A diferença entre as datas é de " + Math.abs(diasDiferenca) + " dias.");

        sc.close();
    }
}
