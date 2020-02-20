package first;

public class Match {

	private Calendar date;
	private BasketTeam homeTeam;
	private BasketTeam awayTeam;
	private Stadium currentStadium;
	
	public Match (Calendar date, BasketTeam homeTeam, BasketTeam awayTeam, Stadium currentStadium) {
		this.date = date;
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
		this.currentStadium = currentStadium;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public Stadium getCurrentStadium() {
		return currentStadium;
	}

	public void setCurrentStadium(Stadium currentStadium) {
		this.currentStadium = currentStadium;
	}

	public BasketTeam getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(BasketTeam homeTeam) {
		this.homeTeam = homeTeam;
	}

	public BasketTeam getAwayTeam() {
		return awayTeam;
	}

	public void setAwayTeam(BasketTeam awayTeam) {
		this.awayTeam = awayTeam;
	}

	public String toString () {
		return "Match :" + homeTeam +" vs " + awayTeam + " | " + currentStadium;
	}
}
