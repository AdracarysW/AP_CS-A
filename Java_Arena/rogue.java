import java.util.Random;

public class Rogue extends Player
{
	Random rand = new Random();

	public Rogue(String nameput){
		super(nameput, 450, 12, 4, 7, "Rogue");
	}

	public int skillOne(){
        int dmg = atk * 3 - 3;
        System.out.println(name + " strikes 3x with reduced damage, doing a total of " + String.valueOf(dmg) + " damage");
        return dmg;
	}

    public int skillTwo(){
        int i = rand.nextInt(5) + 1;
        int dmg = atk * i;
        System.out.println(name + " strikes " + String.valueOf(i) + " amounts of time, doing a total of " + String.valueOf(dmg) + " damage");
        return dmg;
	}
}
