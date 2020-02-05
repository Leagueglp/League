package data.sportaspect;

import java.util.HashMap;

public class Calendar {

	private HashMap<String, Match> match = new HashMap<String, Match>();

	public Calendar(HashMap<String, Match> match) {
		super();
		this.match = match;
	}

	public HashMap<String, Match> getMatch() {
		return match;
	}

	public void setMatch(HashMap<String, Match> match) {
		this.match = match;
	}

	@Override
	public String toString() {
		return "Calendar [match=" + match + "]";
	}
}
