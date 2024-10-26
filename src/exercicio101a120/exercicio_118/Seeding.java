package exercicio101a120.exercicio_118;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Seeding {

        public static List<Pessoa> gerarPessoas(int quantidade) {
            Random random = new Random();
            List<Pessoa> pessoas = new ArrayList<>();

            for (int i = 0; i < quantidade; i++) {
                int sexo = random.nextInt(2);
                double peso = 40 + (130 - 40) * random.nextDouble();
                double altura = 1.50 + (2.0 - 1.50) * random.nextDouble();

                pessoas.add(new Pessoa(sexo, peso, altura));
            }

            return pessoas;
        }
    }
