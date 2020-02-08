package data.macroaspect;

import java.util.HashMap;

import data.microaspect.Franchise;
import data.microaspect.Player;

public class Freeagency extends Event {

	private String start;
	private String end;
	private HashMap<HashMap<Franchise,Player>, Franchise> transfer = new HashMap<HashMap<Franchise,Player>, Franchise>();
	
	public Freeagency(String name, double value, String start, String end,
			HashMap<HashMap<Franchise, Player>, Franchise> transfer) {
		super(name, value);
		this.start = start;
		this.end = end;
		this.transfer = transfer;
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

	public HashMap<HashMap<Franchise, Player>, Franchise> getTransfer() {
		return transfer;
	}

	public void setTransfer(HashMap<HashMap<Franchise, Player>, Franchise> transfer) {
		this.transfer = transfer;
	}

	@Override
	public String toString() {
		return "Freeagency [start=" + start + ", end=" + end + ", transfer=" + transfer + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
