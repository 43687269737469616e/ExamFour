public class Athlete extends Person {

	private String team;
	private String position;

	public Athlete(int age, String team, String position) {
		super(age);
		this.team = team;
		this.position = position;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String toString(){
		String result;
		result = "The team is: " + team + ", and the position is: " + position + super.toString();
		return result;
	}

}