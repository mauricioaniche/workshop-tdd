package modulo2.exercicio.mocks.captor;

public class Produto {

	private String nome;
	private double precoSemDesconto;
	private double precoComDesconto;

	public Produto(String nome, double precoSemDesconto, double precoComDesconto) {
		this.nome = nome;
		this.precoSemDesconto = precoSemDesconto;
		this.precoComDesconto = precoComDesconto;
	}
	public String getNome() {
		return nome;
	}
	public double getPrecoSemDesconto() {
		return precoSemDesconto;
	}
	public double getPrecoComDesconto() {
		return precoComDesconto;
	}

	
		
}
