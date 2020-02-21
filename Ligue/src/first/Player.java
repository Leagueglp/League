package first;

public class Player {
	
	private int id =0;
	private String name;
	private Integer age;
	private Integer rating;
	
	public Player () {
		
	}
	
	public Player (int id, String name, int age, int rating) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Integer getRating() {
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
