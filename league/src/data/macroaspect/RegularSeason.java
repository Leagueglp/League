package data.macroaspect;

import java.util.HashMap;

public class RegularSeason {
	
	private HashMap<Integer, Rank> ranks = new HashMap<Integer, Rank>();

	public RegularSeason(HashMap<Integer, Rank> ranks) {
		super();
		this.ranks = ranks;
	}

	public HashMap<Integer, Rank> getRanks() {
		return ranks;
	}

	public void setRanks(HashMap<Integer, Rank> ranks) {
		this.ranks = ranks;
	}

	@Override
	public String toString() {
		return "RegularSeason [ranks=" + ranks + "]";
	}

	
	

}
