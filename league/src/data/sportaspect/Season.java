package data.sportaspect;

import java.util.HashMap;

public abstract class Season {
	private HashMap<String, Match> matchs = new HashMap<String, Match>();
	private HashMap<String, Franchise> franlist = new HashMap<String, Franchise>();
	private HashMap<String, Event> events = new HashMap<String, Event>();
	private Counter counter;
	private String start;
	private String end;
	
	public Season(HashMap<String, Match> matchs, HashMap<String, Franchise> franlist, HashMap<String, Event> events,
			Counter counter, String start, String end) {
		super();
		this.matchs = matchs;
		this.franlist = franlist;
		this.events = events;
		this.counter = counter;
		this.start = start;
		this.end = end;
	}
	public HashMap<String, Match> getMatchs() {
		return matchs;
	}
	public void setMatchs(HashMap<String, Match> matchs) {
		this.matchs = matchs;
	}
	public HashMap<String, Franchise> getFranlist() {
		return franlist;
	}
	public void setFranlist(HashMap<String, Franchise> franlist) {
		this.franlist = franlist;
	}
	public HashMap<String, Event> getEvents() {
		return events;
	}
	public void setEvents(HashMap<String, Event> events) {
		this.events = events;
	}
	public Counter getCounter() {
		return counter;
	}
	public void setCounter(Counter counter) {
		this.counter = counter;
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
	@Override
	public String toString() {
		return "Season [matchs=" + matchs + ", franlist=" + franlist + ", events=" + events + ", counter=" + counter
				+ ", start=" + start + ", end=" + end + "]";
	}
	
}
