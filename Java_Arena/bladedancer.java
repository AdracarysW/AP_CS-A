public class BladeDancer extends Player
{

	public BladeDancer(String nameput){
		super(nameput, 400, 14, 3, 6, "BladeDancer");
    }

	public int skillOne(){
		int dmg = this.atk * 2;
		this.def += 2;
		System.out.println(this.name + " increases their defenses, allowing them to do " + String.valueOf(dmg) + " damage");
		return dmg;
	}

	public int skillTwo(){
		int dmg = this.atk * 3;
		this.atk += 2;
		System.out.println(this.name + " stregthens themselves, allowing them to do " + String.valueOf(dmg) + " damage");
		return dmg;
	}

}
