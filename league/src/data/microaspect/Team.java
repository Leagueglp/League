package data.microaspect;

public class Team {
	private Player player;
	private double generalstat;

	public Team(Player player, double generalstat) {
		super();
		this.player = player;
		this.generalstat = generalstat;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public double getGeneralstat() {
		return generalstat;
	}

	public void setGeneralstat(double generalstat) {
		this.generalstat = generalstat;
	}

	@Override
	public String toString() {
		return "Team [player=" + player + ", generalstat=" + generalstat + "]";
	}
}
