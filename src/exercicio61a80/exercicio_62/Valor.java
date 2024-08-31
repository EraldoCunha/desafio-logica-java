package exercicio61a80.exercicio_62;

public class Valor {

    private double numero;
    private double quadrado;
    private double cubo;
    private double raizQuadrada;

    public Valor(double numero) {
        this.numero = numero;
        this.quadrado = calcularQuadrado();
        this.cubo = calcularCubo();
        this.raizQuadrada = calcularRaizQuadrada();
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getQuadrado() {
        return quadrado;
    }

    public double getCubo() {
        return cubo;
    }

    public double getRaizQuadrada() {
        return raizQuadrada;
    }


    public double calcularQuadrado(){
        return Math.pow(numero, 2);
    }

    public double calcularCubo(){
        return Math.pow(numero, 3);
    }

    public double calcularRaizQuadrada(){
        return Math.sqrt(numero);
    }
}
