package exercicio_32;

public class Administracao {

	private Cardapio cardapio;
	private Pedido pedido;
	
	 public Administracao() {
	        cardapio = new Cardapio();
	        pedido = new Pedido();
	        inicializarCardapio();
	    }

	    private void inicializarCardapio() {
	    	adicionarItemCardapio("Cachorro quente", 100, 1.20);
	        adicionarItemCardapio("Bauru simples", 101, 1.30);
	        adicionarItemCardapio("Bauru com ovo", 102, 1.50);
	        adicionarItemCardapio("Hambúrguer", 103, 1.20);
	        adicionarItemCardapio("Cheeseburguer", 104, 1.30);
	        adicionarItemCardapio("Refrigerante", 105, 1.00);
	    }
	
	    public void adicionarItemCardapio(String nome, int codigo, double preco) {
	        cardapio.adicionarItem(nome, codigo, preco);
	    }
	    
	   public void adicionarItemPedido(int codigo, int quantidade) {
		   Item item = cardapio.buscarItem(codigo);
		   pedido.adicionarItem(item, quantidade);
	   }
	   
	   public double calcularPrecoItem(int codigo, int quantidade) {
	        return cardapio.calcularUmItem(codigo, quantidade);
	    }
	   
	   public void exibirCardapio() {
	        cardapio.exibirItens();
	    }

	    public void exibirPedido() {
	        pedido.exibirPedido();
	    }

	    public double calcularTotalPedido() {
	    	return pedido.calcularTotal();
	    }
   
}
