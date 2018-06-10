public class Marauder extends Player
{

	public Marauder(String nameput){
		super(nameput, 500, 9, 7, 5, "Marauder");
    }

	public int skillTwo(){
		int loss = (500 - hp) / 4;
		hp += loss;
		System.out.println(name + " recovers a quarter of their missing health! Their health healed " + String.valueOf(loss) + ". Current health: " + String.valueOf(hp));
		return 0;
	}

	public int skillOne(){
		int heal = atk * 2;
		hp += heal;
		System.out.println(name + " strikes twice, healing for " + String.valueOf(heal) + " points of damage. Current health: " + String.valueOf(hp));
		return atk * 2;
	}

}
