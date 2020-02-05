package data.sportaspect;

public class Manager extends Person {
	
	
	private int stat;

	

	public Manager(String firstname, String lastname, int age) {
		super(firstname, lastname, age);
		// TODO Auto-generated constructor stub
	}
	

	public Manager(String firstname, String lastname, int age, int stat) {
		super(firstname, lastname, age);
		this.stat = stat;
	}


	public int getStat() {
		return stat;
	}

	public void setStat(int stat) {
		this.stat = stat;
	}


	@Override
	public String toString() {
		return "Manager [stat=" + stat + ", toString()=" + super.toString() + "]";
	}


}
