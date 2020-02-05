package data.sportaspect;

public class Earning extends Event{

	private double value;
	
	public Earning(String name, double value) {
		super(name);
		this.value = value;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Earning [value=" + value + "]";
	}
}
