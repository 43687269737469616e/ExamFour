import java.util.Scanner;

public class Name {
	private String firstName;
	private String lastName;

	Scanner input = new Scanner(System.in);

	// Constructor
	public Name(){
		System.out.println("Enter your first name: ");
		firstName = input.nextLine();
		System.out.println("Enter your last name: ");
		lastName = input.nextLine();

	}

	// Getters and Setters
	public String getFirstName() {
		System.out.println("Enter first name: ");
		firstName = input.nextLine();
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		System.out.println("Enter last name: ");
		lastName = input.nextLine();
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", lastName=" + lastName + "]";
	}





} // end class