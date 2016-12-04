package program.my;

public class Athlete extends Person {

	private String team;
	private String position;

    //Constructor
    public Athlete(Name name, int age, String team, String position) {
        super(name, age);
        this.team = team;
        this.position = position;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + " Athlete{" +
                "team='" + team + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

    //Setters and Getters
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
}