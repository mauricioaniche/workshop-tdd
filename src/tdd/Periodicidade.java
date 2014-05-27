package tdd;

public enum Periodicidade {

	DIARIA(1),
	SEMANAL(7),
	MENSAL(30);
	
	private int dias;

	Periodicidade(int dias) {
		this.dias = dias;
	}
	
	public int getDias() {
		return dias;
	}
}
