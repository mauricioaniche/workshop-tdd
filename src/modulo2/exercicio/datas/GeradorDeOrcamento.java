package modulo2.exercicio.datas;

import java.util.Calendar;


public class GeradorDeOrcamento {

	public double calculaDesconto(Compra compra) {
		
		if(janeiro()) return compra.getValorLiquido() * 0.05;
		if(natal()) return compra.getValorLiquido() * 0.15;

		return 0;
	}

	private boolean natal() {
		Calendar hoje = Calendar.getInstance();
		return hoje.get(Calendar.MONTH) == Calendar.DECEMBER && 
				hoje.get(Calendar.DAY_OF_MONTH) == 25;	
	}
	
	private boolean janeiro() {
		Calendar hoje = Calendar.getInstance();
		return hoje.get(Calendar.MONTH) == Calendar.JANUARY;
	}
}
