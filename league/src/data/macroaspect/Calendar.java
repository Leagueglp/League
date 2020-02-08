package data.macroaspect;

import java.util.ArrayList;
import java.util.HashMap;

public class Calendar {

	private HashMap<String, Match> match = new HashMap<String, Match>();
	private ArrayList<Event> events = new ArrayList<Event>();
	
	public Calendar(HashMap<String, Match> match, ArrayList<Event> events) {
		super();
		this.match = match;
		this.events = events;
	}

	public HashMap<String, Match> getMatch() {
		return match;
	}

	public void setMatch(HashMap<String, Match> match) {
		this.match = match;
	}

	public ArrayList<Event> getEvents() {
		return events;
	}

	public void setEvents(ArrayList<Event> events) {
		this.events = events;
	}

	@Override
	public String toString() {
		return "Calendar [match=" + match + ", events=" + events + "]";
	}
	

	
}
