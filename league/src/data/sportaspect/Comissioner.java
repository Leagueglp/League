package data.sportaspect;

public class Comissioner extends Person {
	
	private String playername;
	public Comissioner(String firstname, String lastname, int age) {
		super(firstname, lastname, age);
		// TODO Auto-generated constructor stub
	}
	public String getPlayername() {
		return playername;
	}

	public void setPlayername(String playername) {
		this.playername = playername;
	}

	@Override
	public String toString() {
		return "Comissioner [playername=" + playername + ", toString()=" + super.toString() + "]";
	}
	

}
