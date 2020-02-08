package data.macroaspect;

public class Rank {
	
	private String franchise;
	private int victory;
	private int defeat;
	private double gainsbehind;
	private double victorypercentage;
	
	public Rank(String franchise, int victory, int defeat, double gainsbehind, double victorypercentage) {
		super();
		this.franchise = franchise;
		this.victory = victory;
		this.defeat = defeat;
		this.gainsbehind = gainsbehind;
		this.victorypercentage = victorypercentage;
	}

	public String getFranchise() {
		return franchise;
	}

	public void setFranchise(String franchise) {
		this.franchise = franchise;
	}

	public int getVictory() {
		return victory;
	}

	public void setVictory(int victory) {
		this.victory = victory;
	}

	public int getDefeat() {
		return defeat;
	}

	public void setDefeat(int defeat) {
		this.defeat = defeat;
	}

	public double getGainsbehind() {
		return gainsbehind;
	}

	public void setGainsbehind(double gainsbehind) {
		this.gainsbehind = gainsbehind;
	}

	public double getVictorypercentage() {
		return victorypercentage;
	}

	public void setVictorypercentage(double victorypercentage) {
		this.victorypercentage = victorypercentage;
	}

	@Override
	public String toString() {
		return "Rank [franchise=" + franchise + ", victory=" + victory + ", defeat=" + defeat + ", gainsbehind="
				+ gainsbehind + ", victorypercentage=" + victorypercentage + "]";
	}
	
	
}
