
public class Person {

	private Name name;
	private int age;


	// Constructor
	public Person(int age){
		this.name = new Name();
		this.age = age;
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

	// toString
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

} // end class