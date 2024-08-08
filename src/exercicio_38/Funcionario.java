package exercicio_38;

public class Funcionario {

	private String cargo;
	private double salarioAntigo;
	private double salarioAtualizado;
	
	public Funcionario(String cargo, double salarioAntigo) {
		this.cargo = cargo;
		this.salarioAntigo = salarioAntigo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalarioAntigo() {
		return salarioAntigo;
	}

	public void setSalarioAntigo(double salarioAntigo) {
		this.salarioAntigo = salarioAntigo;
	}

	public double getSalarioAtualizado() {
		return salarioAtualizado;
	}

	public void setSalarioAtualizado(double salarioAtualizado) {
		this.salarioAtualizado = salarioAtualizado;
	}
	
	public double calcularDiferenca() {
		return salarioAtualizado - salarioAntigo;
	}
	
}
