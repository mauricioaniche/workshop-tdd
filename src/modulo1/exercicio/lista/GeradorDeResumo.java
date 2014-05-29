package modulo1.exercicio.lista;

import java.util.ArrayList;
import java.util.List;

public class GeradorDeResumo {

	public List<Resumo> gera(List<Negocio> negocios) {

		List<Resumo> resumos = new ArrayList<Resumo>();
		List<Negocio> mesmaData = new ArrayList<Negocio>();
		Negocio referencia = negocios.get(0);

		for (Negocio negocio : negocios) {
			if (!negocio.mesmaDataDo(referencia)) {
				resumos.add(geraResumo(mesmaData));
				mesmaData.clear();
				referencia = negocio;

			}
			mesmaData.add(negocio);
		}
		
		resumos.add(geraResumo(mesmaData));

		return resumos;
	}

	private Resumo geraResumo(List<Negocio> mesmaData) {
		double menor = Double.MAX_VALUE;
		double maior = Double.MIN_VALUE;
		
		for(Negocio negocio : mesmaData) {
			if(negocio.getValor() > maior) maior = negocio.getValor();
			if(negocio.getValor() < menor) menor = negocio.getValor();
		}
		
		return new Resumo(mesmaData.get(0).getData(), maior, menor);
	}
}
