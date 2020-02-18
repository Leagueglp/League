package data.microaspect;

import java.util.ArrayList;
import java.util.HashMap;

public class Stadium {
	
	private int seat;
	private HashMap<String, Double> seatprice;
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	public HashMap<String, Double> getSeatprice() {
		return new HashMap<String, Double>(seat);
	}
	public void setSeatprice(HashMap<String, Double> seatprice) {
		this.seatprice = seatprice;
	}
	
	

}
