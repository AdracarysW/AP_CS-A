public class Marauder extends Player
{

	public Marauder(String nameput){
		super(nameput, 500, 9, 7, 5, "Marauder");
    }

	public int skillTwo(){
		int loss = (500 - this.hp) / 4;
		this.hp += loss;
		System.out.println(this.name + " recovers a quarter of their missing health! Their health healed " + String.valueOf(loss) + ". Current health: " + String.valueOf(self.hp));
		return 0;
	}

	public int skillOne(){
		int heal = this.atk * 2;
		this.hp += heal;
		System.out.println(this.name + " strikes twice, healing for " + String.valueOf(heal) + " points of damage. Current health: " + String.valueOf(this.hp));
		return this.atk * 2;
	}

}
