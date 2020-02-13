package data.budgetaspect;

import java.util.ArrayList;

public class Tvright implements Budget {
	
	
	private static double tvright = 270000000;
	
	

	public static double getTvright() {
		return tvright;
	}



	@Override
	public void setIncome(ArrayList<Double> income) {
		income.add(tvright);		
	}


	@Override
	public void setCost(ArrayList<Double> cost) {
		return;
		
	}
	
	
	
	
}
