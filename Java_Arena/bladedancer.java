public class BladeDancer extends Player
{

	public BladeDancer(String nameput){
		super(nameput, 400, 14, 3, 6, "BladeDancer");
    }

	public int skillOne(){
		int dmg = atk * 2;
		def += 2;
		System.out.println(name + " increases their defenses, allowing them to do " + String.valueOf(dmg) + " damage");
		return dmg;
	}

	public int skillTwo(){
		int dmg = atk * 3;
		atk += 2;
		System.out.println(name + " stregthens themselves, allowing them to do " + String.valueOf(dmg) + " damage");
		return dmg;
	}

}
