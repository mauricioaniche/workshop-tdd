package tdd;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraDeSessoes {

	public List<Integer> gera(int inicio, int fim, Periodicidade periodicidade) {
		
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		for(int i = inicio; i<=fim; i+=periodicidade.getDias()) {
			resultado.add(i);
		}

		return resultado;
	}

}
