package data.macroaspect;

import java.util.HashMap;

import data.microaspect.Franchise;

public abstract class Season {

	private HashMap<String, Franchise> franlist = new HashMap<String, Franchise>();
	private Calendar calendar;
	private Counter counter;
	private String start;
	private String end;
	public Season(HashMap<String, Franchise> franlist, Calendar calendar, Counter counter, String start, String end) {
		super();
		this.franlist = franlist;
		this.calendar = calendar;
		this.counter = counter;
		this.start = start;
		this.end = end;
	}
	public HashMap<String, Franchise> getFranlist() {
		return franlist;
	}
	public void setFranlist(HashMap<String, Franchise> franlist) {
		this.franlist = franlist;
	}
	public Calendar getCalendar() {
		return calendar;
	}
	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
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
		return "Season [franlist=" + franlist + ", calendar=" + calendar + ", counter=" + counter + ", start=" + start
				+ ", end=" + end + "]";
	}
	
	
	
	
}
