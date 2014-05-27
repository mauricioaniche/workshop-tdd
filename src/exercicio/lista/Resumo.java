package exercicio.lista;

import java.util.Calendar;

public class Resumo {

	private Calendar data;
	private double maior;
	private double menor;

	public Resumo(Calendar data, double maior, double menor) {
		this.data = data;
		this.maior = maior;
		this.menor = menor;
	}
	public Calendar getData() {
		return data;
	}
	public double getMaior() {
		return maior;
	}
	public double getMenor() {
		return menor;
	}

	
	
}
