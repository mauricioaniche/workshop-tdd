package module2.exercise.dates;

import java.util.Calendar;


public class ProposalGenerator {

	public double calculateDiscount(Basket basket) {
		
		if(january()) return basket.getAmount() * 0.05;
		if(christmas()) return basket.getAmount() * 0.15;

		return 0;
	}

	private boolean christmas() {
		Calendar today = Calendar.getInstance();
		return today.get(Calendar.MONTH) == Calendar.DECEMBER && 
				today.get(Calendar.DAY_OF_MONTH) == 25;	
	}
	
	private boolean january() {
		Calendar today = Calendar.getInstance();
		return today.get(Calendar.MONTH) == Calendar.JANUARY;
	}
}
