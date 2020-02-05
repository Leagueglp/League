package data.sportaspect;

public class Allstargame extends Earning {

	private Match exmatch;
	
	public Allstargame(String name, double value) {
		super(name, value);
		// TODO Auto-generated constructor stub
	}

	public Match getExmatch() {
		return exmatch;
	}

	public void setExmatch(Match exmatch) {
		this.exmatch = exmatch;
	}

	@Override
	public String toString() {
		return "Allstargame [exmatch=" + exmatch + "]";
	}

}
