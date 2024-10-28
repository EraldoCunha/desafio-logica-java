package exercicio101a120.exercicio_120;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static List<Integer> primos(List<Integer> lista){
        List<Integer> primos = new ArrayList<>();
        for(Integer v : lista){
            if(ehPrimo(v)){
                primos.add(v);
            }
        }
        return primos;
    }

    public static List<Integer> naoPrimos(List<Integer> lista){
        List<Integer> naoPrimos = new ArrayList<>();
        for(Integer v : lista){
            if(!ehPrimo(v)){
                naoPrimos.add(v);
            }
        }
        return naoPrimos;
    }


    public static boolean ehPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void imprimirVetor(List<Integer> lista){
        for(Integer v : lista){
            System.out.print(v + " ");
        }
    }
}
