

public class Golf extends Athlete{

	private String mainSponsor;


	public Golf(int age, String team, String position, String mainSponsor){
		super(age, team, position);
		setMainSponsor(mainSponsor);


	}

	public void doThis(){
		System.out.println("You put it in the hole!!\n");
	}



	public String getMainSponsor() {
		return mainSponsor;
	}

	public void setMainSponsor(String mainSponsor) {
		this.mainSponsor = mainSponsor;
	}

	public String toString(String mainSponsor){
		return "Player: "+ super.getName() + "\nTeam: " + super.getTeam() + "/nPosition: "
					+ super.getPosition() + "\nMain Sponsor: " + mainSponsor
					+ "\nAge: " + super.getAge();
	}


}
