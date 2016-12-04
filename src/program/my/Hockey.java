

public class Hockey extends Athlete{

	private String stickBrand;


	public Hockey(int age, String team, String position, String stickBrand){
		super(age, team, position);
		setStickBrand(stickBrand);


	}

	public void doThis(){
		System.out.println("You are in the penalty box!!\n");
	}



	public String getStickBrand() {
		return stickBrand;
	}

	public void setStickBrand(String stickBrand) {
		this.stickBrand=stickBrand;
	}

	public String toString(String stickBrand){
		return "Player: "+ super.getName() + "\nTeam: " + super.getTeam() + "/nPosition: "
				+ super.getPosition() + "\nMain Sponsor: " + stickBrand
				+ "\nAge: " + super.getAge();
	}


}
