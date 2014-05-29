package modulo2.exercicio.mocks;

import java.util.Calendar;

public class Fatura {

	private Calendar data;
	private String cliente;
	private double valor;
	public Fatura(Calendar data, String cliente, double valor) {
		this.data = data;
		this.cliente = cliente;
		this.valor = valor;
	}
	public Calendar getData() {
		return data;
	}
	public String getCliente() {
		return cliente;
	}
	public double getValor() {
		return valor;
	}
	
	
}
