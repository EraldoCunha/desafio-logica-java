package exercicio_38;

public class TabelaAumento {

	private int codigo;
	private String cargo;
	private int percentual;
	
	public TabelaAumento(int codigo, String cargo, int percentual) {
		this.codigo = codigo;
		this.cargo = cargo;
		this.percentual = percentual;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getPercentual() {
		return percentual;
	}

	public void setPercentual(int percentual) {
		this.percentual = percentual;
	}
	
	public double calcularAumento(Funcionario funcionario) {
		return (funcionario.getSalarioAntigo() * percentual / 100) + funcionario.getSalarioAntigo();
	}
}
