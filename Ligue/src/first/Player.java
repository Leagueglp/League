package first;

public class Player {
	
	private String name;
	private int age;
	private int rating;
	
	public Player () {
		
	}
	
	public Player (String name, int age, int rating) {
		this.name = name;
		this.age = age;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", age=" + age + ", rating=" + rating + "]";
	}

}
