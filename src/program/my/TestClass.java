
public class TestClass {

	public static void main(String[] args) {

		//age, team, position, special
		Baseball hank = new Baseball(26, "Team", "Batter", "Third Base");
		Football terry = new Football(25, "Team2", "QB", "Throwing");
		Hockey mario = new Hockey(27, "Team3", "Center", "CCM");
		Golf tiger = new Golf(28, "Team4", "Green", "Nike");

		Baseball barry = new Baseball(29, "Team4", "Thrower", "Third Base");
		Football payton = new Football(30, "Team5", "QB", "Catching");
		Hockey wayne = new Hockey(31,"Team8", "Center", "Bauer");
		Golf phil = new Golf(42, "Team199", "Driving Range", "Tileist");

		hank.doThis();
		terry.doThis();
		mario.doThis();
		tiger.doThis();
		barry.doThis();
		payton.doThis();
		wayne.doThis();
		phil.doThis();

		System.out.println(hank);
		System.out.println(terry);
		System.out.println(mario);
		System.out.println(barry);
		System.out.println(payton);
		System.out.println(wayne);
		System.out.println(phil);
	}

}
