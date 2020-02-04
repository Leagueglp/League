package data.sportaspect;

public class Rookie extends Contract {
	
	private int draftrank;

	public Rookie(String date, double salary, int duration, int draftrank) {
		super(date, salary, duration);
		this.draftrank = draftrank;
	}

	public int getDraftrank() {
		return draftrank;
	}

	public void setDraftrank(int draftrank) {
		this.draftrank = draftrank;
	}

	@Override
	public String toString() {
		return "Rookie [draftrank=" + draftrank + ", Contract=" + super.toString() + "]";
	}
	
	
	

}
