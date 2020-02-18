package data.microaspect;

import java.util.ArrayList;

public abstract class Team  {
	private ArrayList<Player> players;
	private double generalstat;

	public Team(ArrayList<Player> player, double generalstat) {
		super();
		this.players = player;
		this.generalstat = generalstat;
	}

	public ArrayList<Player> getPlayer() {
		return new ArrayList<Player>();
	}

	public void setPlayer(ArrayList<Player> player) {
		this.players = player;
	}

	public double getGeneralstat() {
		return generalstat;
	}

	public void setGeneralstat(double generalstat) {
		this.generalstat = generalstat;
	}

}
