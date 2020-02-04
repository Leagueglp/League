package data.sportaspect;

public abstract class Contract {
	
	private String date;
	private double salary;
	private int duration;
	
	
	
	public Contract(String date, double salary, int duration) {
		super();
		this.date = date;
		this.salary = salary;
		this.duration = duration;
	}

	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Contract [date=" + date + ", salary=" + salary + ", duration=" + duration + "]";
	}
	

}
