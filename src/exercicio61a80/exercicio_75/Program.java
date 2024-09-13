package exercicio61a80.exercicio_75;

public class Program {

    public static void main(String[] args) {

        int soma = 0;
        int contador = 0;
        for (int i = 13; i <= 73; i++) {
            soma += i;
            contador++;
        }

        double media = (double) soma / contador;
        System.out.printf("A média dos numeros entre 13 e 73 é %.2f", media);

    }
}
