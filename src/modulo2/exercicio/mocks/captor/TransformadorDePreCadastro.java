package modulo2.exercicio.mocks.captor;

import java.util.List;

public class TransformadorDePreCadastro {

	private final RepositorioDeProdutos dao;

	public TransformadorDePreCadastro(RepositorioDeProdutos dao) {
		this.dao = dao;
	}
	
	public void transforma(List<PreCadastro> preCadastros) {
		for(PreCadastro p : preCadastros) {
			if(p.getSugestao() < 500) dao.salva(new Produto(p.getNome(), p.getSugestao(), p.getSugestao() * 0.98));
			if(p.getSugestao() >= 500 && p.getSugestao() <= 1000) dao.salva(new Produto(p.getNome(), p.getSugestao(), p.getSugestao() * 0.96));
			else dao.salva(new Produto(p.getNome(), p.getSugestao(), p.getSugestao() * 0.93));
		}
	}
}
