package exercicio_38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<TabelaAumento> tabela = new ArrayList<>(Arrays.asList(new TabelaAumento(101, "Gerente", 10),
				new TabelaAumento(102, "Engenheiro", 20), new TabelaAumento(103, "Tecnico", 30)));

		System.out.print("Informe seu cargo: ");
		String cargo = sc.nextLine();
		System.out.print("Informe seu salário: ");
		double salario = sc.nextDouble();

		Funcionario funcionario = new Funcionario(cargo, salario);
		boolean cargoMapeado = false;

		for(TabelaAumento a : tabela) {
			if(a.getCargo().equalsIgnoreCase(funcionario.getCargo())){
				funcionario.setSalarioAtualizado(a.calcularAumento(funcionario));
				cargoMapeado = true;
				break;
			}
		}
		if(!cargoMapeado) {
			funcionario.setSalarioAtualizado((funcionario.getSalarioAntigo() * 40 / 100) + funcionario.getSalarioAntigo());
		}
		
		System.out.printf("\nCargo = %s%nSalário Antigo = R$%.2f%nSalário Atualizado = R$%.2f%nDiferença = R$%.2f", funcionario.getCargo()
				, funcionario.getSalarioAntigo()
				, funcionario.getSalarioAtualizado()
				, funcionario.calcularDiferenca());
			
		sc.close();
	}

}
