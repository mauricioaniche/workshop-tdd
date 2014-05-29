package modulo3.exercicio.xml;

public class Negocio {

	private int quantidade;
	private double valor;
	private String cliente;

	public Negocio(int quantidade, double valor, String cliente) {
		this.quantidade = quantidade;
		this.valor = valor;
		this.cliente = cliente;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public double getValor() {
		return valor;
	}
	public String getCliente() {
		return cliente;
	}

	
	
}
