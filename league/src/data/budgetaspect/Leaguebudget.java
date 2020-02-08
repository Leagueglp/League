package data.budgetaspect;

import java.util.ArrayList;

public abstract class Leaguebudget {
	
	private double money;
	private ArrayList<Double> income = new ArrayList<Double>(); 
	private ArrayList<Double> cost = new ArrayList<Double>();
	
	
	public Leaguebudget(double money, ArrayList<Double> income, ArrayList<Double> cost) {
		super();
		this.money = money;
		this.income = income;
		this.cost = cost;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public ArrayList<Double> getIncome() {
		return income;
	}
	public void setIncome(ArrayList<Double> income) {
		this.income = income;
	}
	public ArrayList<Double> getCost() {
		return cost;
	}
	public void setCost(ArrayList<Double> cost) {
		this.cost = cost;
	}
	
	

}
