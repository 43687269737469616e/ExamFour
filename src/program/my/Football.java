package program.my;

public class Football extends Athlete implements DoThis{

	private String specialty;

    //Constructor
    public Football(Name name, int age, String team, String position, String specialty) {
        super(name, age, team, position);
        this.specialty = specialty;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + " Football{" +
                "specialty='" + specialty + '\'' +
                '}';
    }

    public void doThis(){
		System.out.println("I tackle something\n");
	}

    //Setters and Getters
    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
