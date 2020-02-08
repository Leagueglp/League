package data.macroaspect;
import java.util.HashMap;

import data.microaspect.Player;

public class Draft extends Event{
	
	private String date;
	private HashMap<Integer, Player> ranking = new HashMap<Integer, Player>();
	
	public Draft(String name, double value, String date, HashMap<Integer, Player> ranking) {
		super(name, value);
		this.date = date;
		this.ranking = ranking;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public HashMap<Integer, Player> getRanking() {
		return ranking;
	}

	public void setRanking(HashMap<Integer, Player> ranking) {
		this.ranking = ranking;
	}

	@Override
	public String toString() {
		return "Draft [date=" + date + ", ranking=" + ranking + ", toString()=" + super.toString() + "]";
	}
	
	
	
	


	
	
	
}
