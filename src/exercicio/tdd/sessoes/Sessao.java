package exercicio.tdd.sessoes;

import java.util.Calendar;

public class Sessao {

	private Calendar data;
	private int lugaresDisponiveis;
	
	public Sessao(Calendar data, int lugaresDisponiveis) {
		this.data = data;
		this.lugaresDisponiveis = lugaresDisponiveis;
	}

	public Calendar getData() {
		return data;
	}

	public int getLugaresDisponiveis() {
		return lugaresDisponiveis;
	}
	
	
	
}
