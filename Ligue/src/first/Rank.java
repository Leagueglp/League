package first;

public class Rank {
	
	private int victory;
	private int defeat;
	private double victorypercentage;
	
	public Rank(int victory, int defeat, double victorypercentage) {
		super();
		this.victory = victory;
		this.defeat = defeat;
		this.victorypercentage = victorypercentage;
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

	public double calculatePercentage() {
		return (victory+defeat)/2;
	}
	
	public double getVictorypercentage() {
		return victorypercentage;
	}

	public void setVictorypercentage(double victorypercentage) {
		this.victorypercentage = victorypercentage;
	}

	@Override
	public String toString() {
		return "Rank [victory=" + victory + ", defeat=" + defeat + ", victorypercentage=" + victorypercentage + "]";
	}
}
