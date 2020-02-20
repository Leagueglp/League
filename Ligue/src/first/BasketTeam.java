package first;

import java.util.ArrayList;

public class BasketTeam {
	
	private String teamName;
	private String location;
	private Stadium stadium;
	private Rank rank;
	private double stat;
	ArrayList<Player> players = new ArrayList<Player>();
	
	public BasketTeam () {
		
	}
	
	public BasketTeam (String teamName, String location, 
				Stadium stadium,Rank rank, double stat) {
		this.teamName = teamName;
		this.location = location;
		this.stadium = stadium;
		this.rank = rank;
		this.stat = stat;
	}
	

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Stadium getStadium() {
		return stadium;
	}

	public void setStadium(Stadium stadium) {
		this.stadium = stadium;
	}

	public double getStat() {
		return stat;
	}

	public void setStat(double stat) {
		this.stat = stat;
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}

	public void add(Player player) {
		players.add(player);
	}
	
	public void remove(Player player) {
		players.remove(player);
	}
	
	public void calculateStat() {
		double stat = 0;
		for (Player player : players) {
			stat += player.getRating();
		}
		this.stat = stat/100;
	}

	@Override
	public String toString() {
		return "BasketTeam [teamName=" + teamName + ", \nlocation=" + location + ", \nstadium=" + stadium + ", \nrank=" + rank
				+ ", \nstat=" + stat + ", \nplayers=" + players + "]\n";
	}		
}
