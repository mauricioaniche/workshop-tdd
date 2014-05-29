package modulo2.exercicio.tdd.sessoes;

public enum Periodo {

	DIARIA(1),
	SEMANAL(7),
	MENSAL(30);
	
	private int tamanho;

	Periodo(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public int getTamanho() {
		return tamanho;
	}
}
