package modulo1.exercicio.lista;

import java.util.Calendar;

public class Negocio {

	private Calendar data;
	private double valor;
	public Negocio(Calendar data, double valor) {
		this.data = data;
		this.valor = valor;
	}
	public Calendar getData() {
		return data;
	}
	public double getValor() {
		return valor;
	}
	public boolean mesmaDataDo(Negocio referencia) {
		return data.get(Calendar.DAY_OF_MONTH) == referencia.getData().get(Calendar.DAY_OF_MONTH) && 
				data.get(Calendar.MONTH) == referencia.getData().get(Calendar.MONTH) &&
						data.get(Calendar.YEAR) == referencia.getData().get(Calendar.YEAR);
	}
	
	
}
