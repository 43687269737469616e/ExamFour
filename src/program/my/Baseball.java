

public class Baseball extends Athlete{

	private String batPosition;


	public Baseball(int age, String team, String position, String batingPosition){
		super(age, team, position);
		setBatPosition(batPosition);


	}

	public void doThis(){
		System.out.println("You hit!!\n");
	}


	public String getBatPosition() {
		return batPosition;
	}

	public void setBatPosition(String batPosition) {
		this.batPosition = batPosition;
	}

	public String toString(String battingPosition){
		return "Player: "+ super.getName() + "\nTeam: " + super.getTeam() + "/nPosition: "
				+ super.getPosition() + "\nMain Sponsor: " + batPosition
				+ "\nAge: " + super.getAge();
	}


}
