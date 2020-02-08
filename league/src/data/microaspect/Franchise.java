package data.microaspect;

public class Franchise {
	private String teamname;
	private Team team;
	private int ranking;
	private Conference conference;
	private Stadium stadium;
	private double payroll;
	
	

	public Franchise(String teamname, Team team, int ranking, Conference conference, Stadium stadium, double payroll) {
		super();
		this.teamname = teamname;
		this.team = team;
		this.ranking = ranking;
		this.conference = conference;
		this.stadium = stadium;
		this.payroll = payroll;
	}

	public double getPayroll() {
		return payroll;
	}

	public void setPayroll(double payroll) {
		this.payroll = payroll;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public Conference getConference() {
		return conference;
	}

	public void setConference(Conference conference) {
		this.conference = conference;
	}

	public Stadium getStadium() {
		return stadium;
	}

	public void setStadium(Stadium stadium) {
		this.stadium = stadium;
	}

	@Override
	public String toString() {
		return "Franchise [teamname=" + teamname + ", team=" + team + ", ranking=" + ranking + ", conference="
				+ conference + ", stadium=" + stadium + "]";
	}


	
}
