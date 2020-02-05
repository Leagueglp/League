package data.sportaspect;

public abstract class Event {

	private String name;

	public Event(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Event [name=" + name + "]";
	}
	
}
