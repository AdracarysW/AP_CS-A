import java.util.Random;

public class Rogue extends Player
{
	public Rogue(String nameput){
		super(nameput, 450, 12, 4, 7, "Rogue");
	}

	public int skillOne(){
        int dmg = this.atk * 3 - 3;
        System.out.println(this.name + " strikes 3x with reduced damage, doing a total of " + String.valueOf(dmg) + " damage");
        return dmg;
	}

    public int skillTwo(){
        int i = 1 + rand(5);
        int dmg = this.atk * i;
        System.out.println(this.name + " strikes " + String.valueOf(i) + " amounts of time, doing a total of " + String.valueOf(dmg) + " damage");
        return dmg;
	}
}
