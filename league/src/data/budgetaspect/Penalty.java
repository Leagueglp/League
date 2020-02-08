package data.budgetaspect;

import java.util.HashMap;

public class Penalty {
		
	private HashMap<String, Double> pvalue = new HashMap<String, Double>();

	public Penalty(HashMap<String, Double> pvalue) {
		super();
		this.pvalue = pvalue;
	}

	public HashMap<String, Double> getPvalue() {
		return pvalue;
	}

	public void setPvalue(HashMap<String, Double> pvalue) {
		this.pvalue = pvalue;
	}

	@Override
	public String toString() {
		return "Penalty [pvalue=" + pvalue + "]";
	}
	
	
	
	

}
