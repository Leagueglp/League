package data.microaspect;

import data.macroaspect.Draft;

public class Rookie extends Contract {
	

	private Draft draftrank;


	public Rookie(String date, double salary, int duration, Draft draftrank) {
		super(date, salary, duration);
		this.draftrank = draftrank;
	}


	public Draft getDraftrank() {
		return draftrank;
	}


	public void setDraftrank(Draft draftrank) {
		this.draftrank = draftrank;
	}


	@Override
	public String toString() {
		return "Rookie [draftrank=" + draftrank + ", Contract=" + super.toString() + "]";
	}



}
