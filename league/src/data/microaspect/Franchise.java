package data.microaspect;

import java.util.ArrayList;

public class Franchise extends Team {
	private String teamname;
	private int ranking;
	private Conference conference;
	private Stadium stadium;
	private double payroll;
	
	
	public Franchise(ArrayList<Player> player, double generalstat, String teamname, int ranking, Conference conference,
			Stadium stadium, double payroll) {
		super(player, generalstat);
		this.teamname = teamname;
		this.ranking = ranking;
		this.conference = conference;
		this.stadium = stadium;
		this.payroll = payroll;
	}
	@Override
	public ArrayList<Player> getPlayer() {
		// TODO Auto-generated method stub
		return super.getPlayer();
	}
	@Override
	public void setPlayer(ArrayList<Player> player) {
		// TODO Auto-generated method stub
		super.setPlayer(player);
	}
	@Override
	public double getGeneralstat() {
		// TODO Auto-generated method stub
		return super.getGeneralstat();
	}
	@Override
	public void setGeneralstat(double generalstat) {
		// TODO Auto-generated method stub
		super.setGeneralstat(generalstat);
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
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
	public double getPayroll() {
		return payroll;
	}
	public void setPayroll(double payroll) {
		this.payroll = payroll;
	}
	@Override
	public String toString() {
		return "Franchise [teamname=" + teamname + ", ranking=" + ranking + ", conference=" + conference + ", stadium="
				+ stadium + ", payroll=" + payroll + ", getPlayer()=" + getPlayer() + ", getGeneralstat()="
				+ getGeneralstat() + "]";
	}
	
	
	

	
	
}
