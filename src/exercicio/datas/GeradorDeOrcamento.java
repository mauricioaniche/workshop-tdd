package exercicio.datas;

import java.util.Calendar;


public class GeradorDeOrcamento {

	public double calculaDesconto(Compra compra) {
		
		if(janeiro(compra.getData())) {
			return compra.getValorLiquido() * 0.05;
		}

		if(natal(compra.getData())) {
			return compra.getValorLiquido() * 0.15;
		}

		if(ateQuinzeDiasAtras(compra.getData())) {
			return compra.getValorLiquido() * 0.15;
		}

		
		return 0;
	}
	
	private long diasEntre(Calendar a, Calendar b) {
		long ms1 = a.getTimeInMillis();
	    long ms2 = b.getTimeInMillis();
	    long diff = ms2 - ms1;
	    long dias = diff / (24 * 60 * 60 * 1000);
	    
	    return dias < 0 ? dias * -1 : dias;
	}
	
	private boolean ateQuinzeDiasAtras(Calendar data) {
		return diasEntre(data, Calendar.getInstance()) < 15;
	}

	private boolean natal(Calendar hoje) {
		return hoje.get(Calendar.MONTH) == Calendar.DECEMBER && hoje.get(Calendar.DAY_OF_MONTH) == 25;	
	}
	
	private boolean janeiro(Calendar hoje) {
		return hoje.get(Calendar.MONTH) == Calendar.JANUARY;
	}
}
