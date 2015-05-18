package module2.exercise.mocks;

import java.util.Calendar;

public class Invoice {

	private Calendar date;
	private String customer;
	private double amount;
	public Invoice(Calendar date, String customer, double amount) {
		this.date = date;
		this.customer = customer;
		this.amount = amount;
	}
	public Calendar getDate() {
		return date;
	}
	public String getCustomer() {
		return customer;
	}
	public double getAmount() {
		return amount;
	}
	
	
}
