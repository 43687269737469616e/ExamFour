package program.my;
public class TestClass {

	public static void main(String[] args) {

		//name,age, team, position, special
		Baseball hank = new Baseball(new Name("hank","last"),26, "Team", "Batter", "Third Base");
		Football terry = new Football(new Name("terry", "last"),25, "Team2", "QB", "Throwing");
		Hockey mario = new Hockey(new Name("mario", "last"),27, "Team3", "Center", "CCM");
		Golf tiger = new Golf(new Name("tiger", "last"),28, "Team4", "Green", "Nike");

		Baseball barry = new Baseball(new Name("barry", "last"),29, "Team4", "Thrower", "Third Base");
		Football payton = new Football(new Name("payton", "last"),30, "Team5", "QB", "Catching");
		Hockey wayne = new Hockey(new Name("wayne", "last"),31,"Team8", "Center", "Bauer");
		Golf phil = new Golf(new Name("phil", "last"),42, "Team199", "Driving Range", "Titleist");

        //All the following doThis calls are polymorphic
		hank.doThis();
		terry.doThis();
		mario.doThis();
		tiger.doThis();
		barry.doThis();
		payton.doThis();
		wayne.doThis();
		phil.doThis();

        System.out.println(hank.equals(barry));
        System.out.println(terry.equals(payton));
        System.out.println(mario.equals(wayne));
        System.out.println(tiger.equals(phil));
        System.out.println("\n");
        System.out.println(hank.compareTo(barry));
        System.out.println(terry.compareTo(payton));
        System.out.println(mario.compareTo(wayne));
        System.out.println("\n");

		System.out.println(hank);
		System.out.println(terry);
		System.out.println(mario);
		System.out.println(barry);
		System.out.println(payton);
		System.out.println(wayne);
		System.out.println(phil);
	}

}
