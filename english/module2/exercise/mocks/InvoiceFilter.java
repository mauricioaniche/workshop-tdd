package module2.exercise.mocks;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class InvoiceFilter {

	private final InvoiceRepository faturas;

	public InvoiceFilter(InvoiceRepository faturas) {
		this.faturas = faturas;
	}
	
	public List<Invoice> filter() {
		
		List<Invoice> filtradas = new ArrayList<Invoice>();
		
		for(Invoice fatura : faturas.all()) {
			if (fatura.getAmount() > 2000) filtradas.add(fatura);
			else if (fatura.getAmount() < 2000 && fatura.getCustomer().equals("MICROSOFT")) filtradas.add(fatura);
			else if (fatura.getDate().get(Calendar.YEAR) < 1999) filtradas.add(fatura);
		}
		
		return filtradas;
	}
}
