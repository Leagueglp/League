package data.budgetaspect;

import java.util.HashMap;

import data.microaspect.Franchise;

public class Byproduct {
	
	
	HashMap<Franchise, Double> byproduct = new HashMap<Franchise, Double>();

	public Byproduct(HashMap<Franchise, Double> byproduct) {
		super();
		this.byproduct = byproduct;
	}

	public HashMap<Franchise, Double> getByproduct() {
		return byproduct;
	}

	public void setByproduct(HashMap<Franchise, Double> byproduct) {
		this.byproduct = byproduct;
	}

	@Override
	public String toString() {
		return "Byproduct [byproduct=" + byproduct + "]";
	}
	
	
	
	
}
