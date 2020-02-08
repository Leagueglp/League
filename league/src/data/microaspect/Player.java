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
		return "Player [number=" + number + ", contract=" + contract + ", stat=" + stat + ",player="
				+ super.toString() + "]";
	}
	
	

}
