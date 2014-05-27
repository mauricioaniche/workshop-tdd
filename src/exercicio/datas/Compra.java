package exercicio.datas;

import java.util.Calendar;
import java.util.List;

public class Compra {

	private double valorLiquido;
	private List<Item> itens;
	private final Calendar data;

	public Compra(Calendar data, List<Item> itens) {
		this.data = data;
		this.itens = itens;
		somaItens();
	}
	
	private void somaItens() {
		for(Item item : itens) {
			valorLiquido += item.getPrecoTotal();
		}
		
	}
	
	public void reduzValor(double reducao) {
		this.valorLiquido -= reducao;
	}

	public double getValorLiquido() {
		return valorLiquido;
	}

	public int qtdItens() {
		int qtd = 0;
		for(Item item : itens) {
			qtd+= item.getQuantidade();
		}
		return qtd;
	}

	public boolean tem(String produto) {
		for(Item item : itens) {
			if(item.getNome().equals(produto)) return true;
		}
		
		return false;
	}

	public Calendar getData() {
		return data;
	}
}
