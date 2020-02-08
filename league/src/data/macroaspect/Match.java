package data.macroaspect;


public class Match {

	private String date;
	private String franchise1;
	private String franchise2;
	private String location;
	private int score1 ;
	private int score2 ;
	public Match(String date, String franchise1, String franchise2, String location, int score1, int score2) {
		super();
		this.date = date;
		this.franchise1 = franchise1;
		this.franchise2 = franchise2;
		this.location = location;
		this.score1 = score1;
		this.score2 = score2;
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
	public int getScore1() {
		return score1;
	}
	public void setScore1(int score1) {
		this.score1 = score1;
	}
	public int getScore2() {
		return score2;
	}
	public void setScore2(int score2) {
		this.score2 = score2;
	}
	@Override
	public String toString() {
		return "Match [date=" + date + ", franchise1=" + franchise1 + ", franchise2=" + franchise2 + ", location="
				+ location + ", score1=" + score1 + ", score2=" + score2 + "]";
	}
	
	

}
