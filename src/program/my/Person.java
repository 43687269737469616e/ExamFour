package program.my;

public class Person {

	private Name name;
	private int age;


	// Constructor
	public Person(Name name, int age) {
		this.name = name;
		this.age = age;
	}

	//toString
	@Override
	public String toString() {
		return "Person{" +
				"name=" + name +
				", age=" + age +
				'}';
	}

	// Getters and Setters
	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
} // end class