package modulo2.exercicio.datas;

public class Item {

	private final String nome;
	private final int quantidade;
	private final double precoUnitario;
	public Item(String nome, int quantidade, double preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.precoUnitario = preco;
	}
	public String getNome() {
		return nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public double getPrecoTotal() {
		return precoUnitario * quantidade;
	}
	
}
