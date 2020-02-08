package data.budgetaspect;

public class Servicing {
	
	private String date;
	private double value;
	
	public Servicing(String date, double value) {
		super();
		this.date = date;
		this.value = value;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Servicing [date=" + date + ", value=" + value + "]";
	}
	
	
	
}
