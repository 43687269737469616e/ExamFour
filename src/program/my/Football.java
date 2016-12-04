import javax.swing.JOptionPane;

public class Football extends Athlete{

	private String specialty;


	public Football(int age, String team, String position, String specialty){
		super(age, team, position);
		setSpecialty(specialty);


	}

	public void doThis(){
		System.out.println("You made a tackle!!\n");
	}



	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty=specialty;
	}

	public String toString(String specialty){
		return "Player: "+ super.getName() + "\nTeam: " + super.getTeam() + "/nPosition: "
				+ super.getPosition() + "\nMain Sponsor: " + specialty
				+ "\nAge: " + super.getAge();
	}


}
