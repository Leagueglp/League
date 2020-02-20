package first;

import java.util.ArrayList;

public class League {
	
	private String leagueName;
	private ArrayList<BasketTeam> basketTeams;
	
	public League() {
		
	}
	
	public League (String leagueName) {
		this.leagueName = leagueName;
	}

	public String getLeagueName() {
		return leagueName;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	public ArrayList<BasketTeam> getBasketTeams() {
		return basketTeams;
	}

	public void setBasketTeams(ArrayList<BasketTeam> basketTeams) {
		this.basketTeams = basketTeams;
	}

}
