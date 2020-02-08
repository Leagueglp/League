package data.budgetaspect;

import java.util.ArrayList;

public class Franchisebudget extends Leaguebudget  {

	public Franchisebudget(double money, ArrayList<Double> income, ArrayList<Double> cost) {
		super(money, income, cost);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Franchisebudget [getMoney()=" + getMoney() + ", getIncome()=" + getIncome() + ", getCost()=" + getCost()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	

}
