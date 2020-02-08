package data.budgetaspect;

public class Luxurytax {
	
	private double limit;

	public Luxurytax(double limit) {
		super();
		this.limit = limit;
	}

	public double getLimit() {
		return limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}

	@Override
	public String toString() {
		return "Luxurytax [limit=" + limit + "]";
	}
	
	
	
	

}
