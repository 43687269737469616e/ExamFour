package program.my;

public class Golf extends Athlete implements DoThis, Comparable{

	private String mainSponsor;

	//Constructor

	public Golf(Name name, int age, String team, String position, String mainSponsor) {
		super(name, age, team, position);
		this.mainSponsor = mainSponsor;
	}

    //This is a polymorphic method from DoThis interface
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

    @Override
    public int compareTo(Object o){
        int result;
        result = getAge() - ((Golf)o).getAge();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Golf)) return false;

        Golf golf = (Golf) o;

        return getMainSponsor().equals(golf.getMainSponsor());
    }
}
