package exercicio61a80.exercicio_70;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Habitante> habitantes = new ArrayList<>(Arrays.asList(
                new Habitante("Carlos Silva", 34, Sexo.M, CorOlhos.CASTANHO, CorCabelo.PRETO),
                new Habitante("Ana Pereira", 28, Sexo.F, CorOlhos.VERDE, CorCabelo.LOIRO),
                new Habitante("Mariana Souza", 45, Sexo.F, CorOlhos.AZUL, CorCabelo.LOIRO),
                new Habitante("João Costa", 50, Sexo.M, CorOlhos.CASTANHO, CorCabelo.CASTANHO),
                new Habitante("Lucas Oliveira", 22, Sexo.M, CorOlhos.VERDE, CorCabelo.PRETO),
                new Habitante("Fernanda Lima", 30, Sexo.F, CorOlhos.VERDE, CorCabelo.LOIRO),
                new Habitante("Pedro Gonçalves", 38, Sexo.M, CorOlhos.AZUL, CorCabelo.CASTANHO),
                new Habitante("Julia Mendes", 27, Sexo.F, CorOlhos.CASTANHO, CorCabelo.PRETO),
                new Habitante("Ricardo Alves", 42, Sexo.M, CorOlhos.AZUL, CorCabelo.LOIRO),
                new Habitante("Bianca Fernandes", 19, Sexo.F, CorOlhos.VERDE, CorCabelo.CASTANHO),
                new Habitante("Tiago Rocha", 36, Sexo.M, CorOlhos.CASTANHO, CorCabelo.PRETO),
                new Habitante("Larissa Nunes", 25, Sexo.F, CorOlhos.AZUL, CorCabelo.LOIRO),
                new Habitante("Gabriel Souza", 40, Sexo.M, CorOlhos.VERDE, CorCabelo.CASTANHO),
                new Habitante("Isabela Duarte", 33, Sexo.F, CorOlhos.CASTANHO, CorCabelo.PRETO),
                new Habitante("Marcos Brito", 29, Sexo.M, CorOlhos.AZUL, CorCabelo.CASTANHO)));

        int maiorIdade = Habitante.maiorIdade(habitantes);
        int qtdMulheresQuestaoF = Habitante.qtdMulheresQuestaoF(habitantes);

        System.out.println("Maior idade = " + maiorIdade);
        System.out.println("Quantidade de mulheres loiras com olhos verdes que tem entre 18 e 35 anos = " + qtdMulheresQuestaoF);
    }
}
