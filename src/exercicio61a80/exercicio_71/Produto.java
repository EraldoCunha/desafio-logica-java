package exercicio61a80.exercicio_71;

import java.util.List;

public class Produto {

    private Integer codigo;
    private Double preco;
    private Double precoComAumento;

    private Double aumento = 20d;

    public Produto(Integer codigo, Double preco) {
        this.codigo = codigo;
        this.preco = preco;
        this.precoComAumento = calcularAumento();
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getPrecoComAumento() {
        return precoComAumento;
    }

    public void setPrecoComAumento(Double precoComAumento) {
        this.precoComAumento = precoComAumento;
    }

    public Double getAumento() {
        return aumento;
    }

    public void setAumento(Double aumento) {
        this.aumento = aumento;
    }

    public double calcularAumento() {
        return preco + (preco * aumento) / 100;
    }

    public static double calcularMediaPrecoCusto(List<Produto> lista) {
        double soma = 0;
        if (!lista.isEmpty()) {
            for (Produto v : lista) {
                soma += v.getPreco();
            }
            return soma / lista.size();
        } else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public static double calcularMediaPrecoaumentado(List<Produto> lista) {
        double soma = 0;
        if (!lista.isEmpty()) {
            for (Produto v : lista) {
                soma += v.getPrecoComAumento();
            }
            return soma / lista.size();
        } else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public static void imprimirLista(List<Produto> lista){
        if (!lista.isEmpty()) {
            for (Produto v : lista) {
                System.out.printf("Id = %d %nPreço atualizado = R$%.2f%n" ,v.getCodigo(), v.getPrecoComAumento());
            }
            double mediaPrecoCusto = calcularMediaPrecoCusto(lista);
            double mediaPrecoaumentado = calcularMediaPrecoaumentado(lista);

            System.out.printf("%nMédia dos preços de custo = R$%.2f%n" , mediaPrecoCusto);
            System.out.printf("Média dos preços com aumento = R$%.2f%n" , mediaPrecoaumentado);

        } else{
            throw new RuntimeException("A lista está vazia!");
        }
    }
}
