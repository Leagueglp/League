package data.budgetaspect;

import java.util.ArrayList;

public class Franchisebudget implements Budget  {
	
	private double money;
	private ArrayList<Double> income = new ArrayList<Double>(); 
	private ArrayList<Double> cost = new ArrayList<Double>();
	public Franchisebudget(double money, ArrayList<Double> income, ArrayList<Double> cost) {
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
	@Override
	public void setIncome(ArrayList<Double> income) {
		this.income = income;
		
	}
	@Override
	public void setCost(ArrayList<Double> cost) {
		this.cost = cost;
		
		
	}
	@Override
	public String toString() {
		return "Franchisebudget [money=" + money + ", income=" + income + ", cost=" + cost + "]";
	}



}
