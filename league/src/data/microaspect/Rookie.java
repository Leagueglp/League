package data.microaspect;

public class Rookie extends Contract {
	

	private int draftrank;


	public Rookie(String date, double salary, int duration, int draftrank) {
		super(date, salary, duration);
		this.draftrank = draftrank;
	}

	
	@Override
	public String getDate() {
		// TODO Auto-generated method stub
		return super.getDate();
	}


	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary();
	}


	@Override
	public void setSalary(double salary) {
		// TODO Auto-generated method stub
		super.setSalary(salary);
	}


	@Override
	public int getDuration() {
		// TODO Auto-generated method stub
		return super.getDuration();
	}


	@Override
	public void setDuration(int duration) {
		// TODO Auto-generated method stub
		super.setDuration(duration);
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
