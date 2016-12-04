package program.my;

public class Hockey extends Athlete implements DoThis{

	private String stickBrand;


    //Constructor
    public Hockey(Name name, int age, String team, String position, String stickBrand) {
        super(name, age, team, position);
        this.stickBrand = stickBrand;
    }

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
}
