package data.macroaspect;

public abstract class Event {

	private String name;
	private double value;

	

	public Event(String name, double value) {
		super();
		this.name = name;
		this.value = value;
	}
	

	public double getValue() {
		return value;
	}


	public void setValue(double value) {
		this.value = value;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Event [name=" + name + ", value=" + value + "]";
	}
	
	

}
