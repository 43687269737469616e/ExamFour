package program.my;

public class Golf extends Athlete implements DoThis{

	private String mainSponsor;

	//Constructor

	public Golf(Name name, int age, String team, String position, String mainSponsor) {
		super(name, age, team, position);
		this.mainSponsor = mainSponsor;
	}

	public void doThis(){
		System.out.println("I putt it in the hole\n");
	}

	//toString
	@Override
	public String toString() {
		return super.toString() + " Golf{" +
				"mainSponsor='" + mainSponsor + '\'' +
				'}';
	}

	//Setters and Getters
	public String getMainSponsor() {
		return mainSponsor;
	}

	public void setMainSponsor(String mainSponsor) {
		this.mainSponsor = mainSponsor;
	}
}
