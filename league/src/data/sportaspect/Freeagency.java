package data.sportaspect;

import java.util.HashMap;

public class Freeagency extends Earning {

	private String start;
	private String end;
	private HashMap<Franchise, String> byproduct = new HashMap<Franchise, String>();
	
	public Freeagency(String name, double value) {
		super(name, value);
		// TODO Auto-generated constructor stub
	}
	

	public Freeagency(String name, double value, String start, String end, HashMap<Franchise, String> byproduct) {
		super(name, value);
		this.start = start;
		this.end = end;
		this.byproduct = byproduct;
	}


	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public HashMap<Franchise, String> getByproduct() {
		return byproduct;
	}

	public void setByproduct(HashMap<Franchise, String> byproduct) {
		this.byproduct = byproduct;
	}

	@Override
	public String toString() {
		return "Freeagency [start=" + start + ", end=" + end + ", byproduct=" + byproduct + "]";
	}
	
}
