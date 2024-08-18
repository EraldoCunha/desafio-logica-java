package exercicio41a60.exercicio_49;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Pessoa chico = new Pessoa("Chico", 1.50, 0.02);
        Pessoa ze = new Pessoa("Zé", 1.10, 0.03);
        int anos = 0;

        while (chico.getAltura() > ze.getAltura()) {
            chico.acrescentarAltura();
            ze.acrescentarAltura();
            anos++;
        }

        System.out.printf("Se passaram %d anos até que %s superasse a altura de %s.", anos, ze.getNome(), chico.getNome());

        sc.close();
    }
}
