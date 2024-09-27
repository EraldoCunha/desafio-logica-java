package exercicio81a100.exercicio_89;

public class Cliente {

    private String nome;
    private Double valorCompras;
    private Double bonus;

    public Cliente(String nome, Double valorCompras) {
        this.nome = nome;
        this.valorCompras = valorCompras;
        this.bonus = calcularBonus();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorCompras() {
        return valorCompras;
    }

    public void setValorCompras(Double valorCompras) {
        this.valorCompras = valorCompras;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    public double calcularBonus(){
        return valorCompras < 500000 ? valorCompras * 0.10 : valorCompras * 0.15;
    }

    public void imprimirCliente(){
        System.out.printf("%nNome: %s , valor das compras no último ano: R$%.2f , bonus concedido: R$%.2f%n" , getNome() , getValorCompras() , getBonus());
    }
}
