package program.my;

public class Hockey extends Athlete implements DoThis, Comparable{

	private String stickBrand;


    //Constructor
    public Hockey(Name name, int age, String team, String position, String stickBrand) {
        super(name, age, team, position);
        this.stickBrand = stickBrand;
    }

    //This is a polymorphic method from DoThis interface
    public void doThis(){
        System.out.println("I sit in a penalty box\n");
    }

	//toString
    @Override
    public String toString() {
        return super.toString() + " Hockey{" +
                "stickBrand='" + stickBrand + '\'' +
                '}';
    }

    //Setters and Getters
    public String getStickBrand() {
        return stickBrand;
    }

    public void setStickBrand(String stickBrand) {
        this.stickBrand = stickBrand;
    }

    @Override
    public int compareTo(Object o){
       int result;
        result = getAge() - ((Hockey)o).getAge();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hockey)) return false;

        Hockey hockey = (Hockey) o;

        return getStickBrand().equals(hockey.getStickBrand());
    }
}
