package data.sportaspect;

public class Veterant extends Contract {
	

	private int teamduration;
	public Veterant(String date, double salary, int duration) {
		super(date, salary, duration);
		// TODO Auto-generated constructor stub
	}

	public int getTeamduration() {
		return teamduration;
	}

	public void setTeamduration(int teamduration) {
		this.teamduration = teamduration;
	}

	@Override
	public String toString() {
		return "Veterant [teamduration=" + teamduration + ", toString()=" + super.toString() + "]";
	}
	
	

}
