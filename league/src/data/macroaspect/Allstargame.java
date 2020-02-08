package data.macroaspect;

public class Allstargame extends Event {

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
		return "Allstargame [exmatch=" + exmatch + ", toString()=" + super.toString() + "]";
	}



}
