package exercicio81a100.exercicio_82;

public class Program {

    public static void main(String[] args) {
        int contador = 0;
        int numero = 2;

        while (contador < 5) {
            int somaDivisores = 0;

            for (int i = 1; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    somaDivisores += i;

                    if (i != 1 && i != numero / i) {
                        somaDivisores += numero / i;
                    }
                }
            }

            if (somaDivisores == numero) {
                System.out.println(numero + " é um número perfeito.");
                contador++;
            }

            numero++;

            //A cada 100000 numeros verificados ele será impresso, serve para verificar o progresso do código até encontrar o próximo numero.
            if (numero % 100000 == 0) {
                System.out.println("Verificando número: " + numero);
            }
        }
    }
}
