package data.sportaspect;

public class Popularity extends Event{

	private int pvalue;
	
	public Popularity(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public int getPvalue() {
		return pvalue;
	}

	public void setPvalue(int pvalue) {
		this.pvalue = pvalue;
	}

	@Override
	public String toString() {
		return "Popularity [pvalue=" + pvalue + "]";
	}
}
