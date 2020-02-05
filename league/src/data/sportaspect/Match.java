package data.sportaspect;


public class Match {

	private String date;
	private String franchise1;
	private String franchise2;
	private String location;
	
	public Match(String date, String franchise1, String franchise2, String location) {
		super();
		this.date = date;
		this.franchise1 = franchise1;
		this.franchise2 = franchise2;
		this.location = location;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getFranchise1() {
		return franchise1;
	}
	public void setFranchise1(String franchise1) {
		this.franchise1 = franchise1;
	}
	public String getFranchise2() {
		return franchise2;
	}
	public void setFranchise2(String franchise2) {
		this.franchise2 = franchise2;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Match [date=" + date + ", franchise1=" + franchise1 + ", franchise2=" + franchise2 + ", location="
				+ location + ", getDate()=" + getDate() + ", getFranchise1()=" + getFranchise1() + ", getFranchise2()="
				+ getFranchise2() + ", getLocation()=" + getLocation() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
}
