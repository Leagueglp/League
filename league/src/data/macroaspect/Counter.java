package data.macroaspect;

public class Counter{

	private String date;

	public Counter(String date) {
		super();
		this.date = date;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Counter [date=" + date + "]";
	}

}
