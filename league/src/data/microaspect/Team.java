package data.microaspect;

public class Team {
	private Player players;
	private double generalstat;

	public Team(Player player, double generalstat) {
		super();
		this.players = player;
		this.generalstat = generalstat;
	}

	public Player getPlayer() {
		return players;
	}

	public void setPlayer(Player player) {
		this.players = player;
	}

	public double getGeneralstat() {
		return generalstat;
	}

	public void setGeneralstat(double generalstat) {
		this.generalstat = generalstat;
	}

	@Override
	public String toString() {
		return "Team [player=" + players + ", generalstat=" + generalstat + "]";
	}
}
