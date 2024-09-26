package exercicio81a100.exercicio_88;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Seeding {

    public static List<Pessoa> gerarPessoas(int quantidade) {
        Random random = new Random();
        List<Pessoa> pessoas = new ArrayList<>();

        for (int i = 0; i < quantidade; i++) {
            int sexo = random.nextInt(2);
            int idade = random.nextInt(100) + 1;
            double altura = 1.4 + (random.nextDouble() * (2.0 - 1.4));
            altura = Math.round(altura * 100.0) / 100.0;
            pessoas.add(new Pessoa(sexo, idade, altura));
        }

        return pessoas;
    }
}
