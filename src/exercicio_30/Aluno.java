package exercicio_30;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Aluno {

	private Long ra;
	private List<Double> notas;
	private double media;
	private String status;
	
	public Aluno(Long ra, List<Double> notas) {
		this.ra = ra;
		this.notas = notas;
		this.media = calcularMedia();
		this.status = verificarStatus();
	}

	public Long getRa() {
		return ra;
	}

	public void setRa(Long ra) {
		this.ra = ra;
	}

	public List<Double> getNotas() {
		return notas;
	}

	public void setNotas(List<Double> notas) {
		this.notas = notas;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public double calcularMedia() {
		double media = 0;
		List<Double> notasOrdenadas = notas.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		media = (notasOrdenadas.get(0) * 4 + notasOrdenadas.get(1) * 3 + notasOrdenadas.get(2) * 3) / 10d;
		return media;
	}
	
	public String	verificarStatus() {
		return media >= 5 ? "APROVADO" : "REPROVADO";
	}

	@Override
	public String toString() {
		return "\nAluno RA= " + ra + "\nNotas= " + notas + "\nMedia= " + media + "\nO aluno(a) está " + status;
	}
}
