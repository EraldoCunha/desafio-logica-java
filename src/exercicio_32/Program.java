package exercicio_32;

public class Program {

	public static void main(String[] args) {
		
		Administracao admin = new Administracao();

        admin.exibirCardapio();
        System.out.println("\na:");
        
        System.out.println(String.format("\nValor do pedido do item: R$%.2f", admin.calcularPrecoItem(102,4)));
        
        System.out.println("\nb:");
        admin.adicionarItemPedido(100, 2);
        admin.adicionarItemPedido(103, 3);
        admin.adicionarItemPedido(101, 1);
        admin.adicionarItemPedido(102, 4);
        admin.adicionarItemPedido(105, 7);
        admin.adicionarItemPedido(104, 1);
        
        admin.exibirPedido();

        System.out.println(String.format("\nTotal do pedido: R$%.2f", admin.calcularTotalPedido()));
        
	}

}
