package modulo2.exercicio.mocks.verify;

import java.util.List;

public class AtualizadorDeCadastro {

	private final ProdutoDao dao;
	public AtualizadorDeCadastro(ProdutoDao dao) {
		this.dao = dao;
	}
	
	public void atualiza(List<Produto> produtos) {
		for(Produto produto : produtos) {
			produto.atualiza(produto.getPreco() * 1.02);
			dao.atualiza(produto);
		}
	}
}
