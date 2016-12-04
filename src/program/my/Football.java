package program.my;

import java.util.Comparator;

public class Football extends Athlete implements DoThis, Comparable{

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

    //This is a polymorphic method from DoThis interface
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

    @Override
    public int compareTo(Object o){
        int result;
        result = getAge() - ((Football)o).getAge();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Football)) return false;

        Football football = (Football) o;

        return getSpecialty().equals(football.getSpecialty());
    }
}
