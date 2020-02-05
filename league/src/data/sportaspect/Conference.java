package data.sportaspect;

public class Conference {
	
	private String name;
	private Division division;
	
	public Conference(String name, Division division) {
		super();
		this.name = name;
		this.division = division;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Division getDivision() {
		return division;
	}
	public void setDivision(Division division) {
		this.division = division;
	}

	@Override
	public String toString() {
		return "Conference [name=" + name + ", division=" + division + "]";
	}

}
