package data.budgetaspect;

import java.util.HashMap;

public class Penaltyearn extends Penalty {

	private double value;

	public Penaltyearn(HashMap<String, Double> pvalue, double value) {
		super(pvalue);
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
		return "Penaltyearn [value=" + value + ", toString()=" + super.toString() + "]";
	}
	
	
}
