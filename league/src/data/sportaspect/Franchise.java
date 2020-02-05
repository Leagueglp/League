package data.sportaspect;

public class Franchise {
	private String teamname;
	private Staff staff;
	private Team team;
	private int ranking;
	private Conference conference;
	private String stadium;
	private Calendar calendar;
	
	public Franchise(String teamname, Staff staff, Team team, int ranking, Conference conference, String stadium,
			Calendar calendar) {
		super();
		this.teamname = teamname;
		this.staff = staff;
		this.team = team;
		this.ranking = ranking;
		this.conference = conference;
		this.stadium = stadium;
		this.calendar = calendar;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
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

	public String getStadium() {
		return stadium;
	}

	public void setStadium(String stadium) {
		this.stadium = stadium;
	}

	public Calendar getCalendar() {
		return calendar;
	}

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}

	@Override
	public String toString() {
		return "Franchise [teamname=" + teamname + ", staff=" + staff + ", team=" + team + ", ranking=" + ranking
				+ ", conference=" + conference + ", stadium=" + stadium + ", calendar=" + calendar + "]";
	}
	
}
