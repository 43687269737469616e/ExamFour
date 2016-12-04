package program.my;

import java.util.Comparator;

public class Baseball extends Athlete implements DoThis, Comparable{

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

    //This is a polymorphic method from DoThis interface
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

    @Override
    public int compareTo(Object o){
        int result;
        result = getAge() - ((Baseball)o).getAge();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Baseball)) return false;

        Baseball baseball = (Baseball) o;

        return getBatPosition().equals(baseball.getBatPosition());
    }
}
