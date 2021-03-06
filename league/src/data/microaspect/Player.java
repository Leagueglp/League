package data.microaspect;



public class Player extends Person {
	

	private int number;
	private Contract contract;
	private int stat;
	
	
	public Player(String firstname, String lastname, int age, int number, Contract contract, int stat) {
		super(firstname, lastname, age);
		this.number = number;
		this.contract = contract;
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


	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Contract getContract() {
		return contract;
	}
	public void setContract(Contract contract) {
		this.contract = contract;
	}
	public int getStat() {
		return stat;
	}
	public void setStat(int stat) {
		this.stat = stat;
	}
	@Override
	public String toString() {
		return "Player"+ super.toString() + "[number=" + number + ", contract=" + contract + ", stat=" + stat + "]";
	}
	
	

}
