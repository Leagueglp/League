package data.microaspect;

public class Manager extends Person {
		
	private int stat;

	

	public Manager(String firstname, String lastname, int age, int stat) {
		super(firstname, lastname, age);
		this.stat = stat;
	}
	
	

	@Override
	public String getFirstname() {
		// TODO Auto-generated method stub
		return super.getFirstname();
	}


	@Override
	public String getLastname() {
		// TODO Auto-generated method stub
		return super.getLastname();
	}


	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return super.getAge();
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
