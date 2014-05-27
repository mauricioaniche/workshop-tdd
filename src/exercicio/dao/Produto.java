package exercicio.dao;

public class Produto {

	private int id;
	private String nome;
	private String descricao;
	private double preco;
	public Produto(int id, String nome, String descricao, double preco) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public double getPreco() {
		return preco;
	}
	
	public String getDescricao() {
		return descricao;
	}	
}
