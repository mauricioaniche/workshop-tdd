package modulo1.exercicio.desconto;

public class AplicadorDeDescontos {

	public void aplica(Compra compra) {
		boolean retorno = descontoPorProduto(compra);
		if(!retorno) descontoPorValor(compra);
	}

	private boolean descontoPorProduto(Compra compra) {
		if(compra.tem("MACBOOK") && compra.tem("IPHONE")) {
			compra.reduzValor(compra.getValorLiquido() * 0.15);
			return true;
		}

		if(compra.tem("NOTEBOOK") && compra.tem("WINDOWS PHONE")) {
			compra.reduzValor(compra.getValorLiquido() * 0.12);
			return true;
		}
		
		if(compra.tem("XBOX")) {
			compra.reduzValor(compra.getValorLiquido() * 0.7);
			return true;
		}
		
		return false;
	}

	private void descontoPorValor(Compra compra) {
		
		if(compra.getValorLiquido()<=1000 && compra.qtdItens() <= 2) {
			compra.reduzValor(compra.getValorLiquido() * 0.02);
		}
		
		else if(compra.getValorLiquido() > 3000 && compra.qtdItens() < 5 && compra.qtdItens() > 2) {
			compra.reduzValor(compra.getValorLiquido() * 0.05);
		}

		else if(compra.getValorLiquido() > 3000 && compra.qtdItens() >= 5) {
			compra.reduzValor(compra.getValorLiquido() * 0.06);
		}
	}
}
