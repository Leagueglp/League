package data.budgetaspect;

public class Salarycap {
	
	private double limit ;

	public Salarycap(double limit) {
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
		return "Salarycap [limit=" + limit + "]";
	}
	
	

}
