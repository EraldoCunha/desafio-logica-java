package exercicio41a60.exercicio_51;

public class Candidato {

    private int codigo;
    private String nome;
    private int votosRecebidos;

    public Candidato(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getVotosRecebidos() {
        return votosRecebidos;
    }

    public void adicionarVoto(){
        votosRecebidos ++;
    }


    public String toString() {
        return "Digite " + codigo + " para votar " + nome;
    }
}
