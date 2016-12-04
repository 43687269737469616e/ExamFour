package program.my;

public class Baseball extends Athlete implements DoThis{

	private String batPosition;

    //Constructor
    public Baseball(Name name, int age, String team, String position, String batPosition) {
        super(name, age, team, position);
        this.batPosition = batPosition;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() +" Baseball{" +
                "batPosition='" + batPosition + '\'' +
                '}';
    }

    public void doThis(){
		System.out.println("I hit something\n");
	}

	//Setters and Getters
    public String getBatPosition() {
        return batPosition;
    }

    public void setBatPosition(String batPosition) {
        this.batPosition = batPosition;
    }
}
