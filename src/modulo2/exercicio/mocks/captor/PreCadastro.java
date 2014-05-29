package modulo2.exercicio.mocks.captor;

public class PreCadastro {

	private String nome;
	private double sugestao;

	public PreCadastro(String nome, double sugestao) {
		this.nome = nome;
		this.sugestao = sugestao;
	}
	
	
	public String getNome() {
		return nome;
	}
	public double getSugestao() {
		return sugestao;
	}
}
