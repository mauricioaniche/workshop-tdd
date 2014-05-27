package tdd;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraDeSessoesTest {

	private CalculadoraDeSessoes calc;
	@Before
	public void setUp() {
		calc = new CalculadoraDeSessoes();
	}
	@Test
	public void periodicidadeDiariaDe1DiaParaOutro() {
		int inicio = 1;
		int fim = 1;
		List<Integer> datas = calc.gera(inicio, fim, Periodicidade.DIARIA);
		
		Assert.assertEquals(1, datas.size());
		Assert.assertEquals(new Integer(1), datas.get(0));
	}
	
	@Test
	public void periodicidadeDiariaDe1DiaParaVarios() {
		List<Integer> datas = calc.gera(1, 5, Periodicidade.DIARIA);
		
		Assert.assertEquals(5, datas.size());
		Assert.assertEquals(new Integer(1), datas.get(0));
		Assert.assertEquals(new Integer(2), datas.get(1));
		Assert.assertEquals(new Integer(3), datas.get(2));
		Assert.assertEquals(new Integer(4), datas.get(3));
		Assert.assertEquals(new Integer(5), datas.get(4));
	}

	@Test
	public void periodicidadeSemanal() {
		List<Integer> datas = calc.gera(1, 20, Periodicidade.SEMANAL);
		
		Assert.assertEquals(3, datas.size());
		Assert.assertEquals(new Integer(1), datas.get(0));
		Assert.assertEquals(new Integer(8), datas.get(1));
		Assert.assertEquals(new Integer(15), datas.get(2));
	}
	@Test
	public void periodicidadeSemanalComDataFimNoLimite() {
		List<Integer> datas = calc.gera(1, 22, Periodicidade.SEMANAL);
		
		Assert.assertEquals(4, datas.size());
		Assert.assertEquals(new Integer(1), datas.get(0));
		Assert.assertEquals(new Integer(8), datas.get(1));
		Assert.assertEquals(new Integer(15), datas.get(2));
		Assert.assertEquals(new Integer(22), datas.get(3));
	}
	@Test
	public void periodicidadeMensal() {
		List<Integer> datas = calc.gera(1, 90, Periodicidade.MENSAL);
		
		Assert.assertEquals(3, datas.size());
		Assert.assertEquals(new Integer(1), datas.get(0));
		Assert.assertEquals(new Integer(31), datas.get(1));
		Assert.assertEquals(new Integer(61), datas.get(2));
	}
	
	
}
