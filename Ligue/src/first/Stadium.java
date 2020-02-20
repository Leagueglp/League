package first;

public class Stadium {

	private String name;
	private int capacityStadium;
	private int vipSeat;
	private int premiumSeat;
	private int standardSeat;
	
	public Stadium (String name, int capacityStadium,
			int vipSeat, int premiumSeat, int standartSeat) {
		this.name = name;
		this.capacityStadium = capacityStadium;
		this.vipSeat = vipSeat;
		this.premiumSeat = premiumSeat;
		this.standardSeat = standartSeat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacityStadium() {
		return capacityStadium;
	}

	public void setCapacityStadium(int capacityStadium) {
		this.capacityStadium = capacityStadium;
	}

	public int getVipSeat() {
		return vipSeat;
	}

	public void setVipSeat(int vipSeat) {
		this.vipSeat = vipSeat;
	}

	public int getPremiumSeat() {
		return premiumSeat;
	}

	public void setPremiumSeat(int premiumSeat) {
		this.premiumSeat = premiumSeat;
	}

	public int getStandardSeat() {
		return standardSeat;
	}

	public void setStandardSeat(int standardSeat) {
		this.standardSeat = standardSeat;
	}

	public String toString () {
		return name + " - " + capacityStadium + " seats";
	}
}
