
public class Player{

	public String name;
	public int hp;
	public int atk;
	public int def;
	public int spd;
	public String job;

	public Player(String nameput, int health, int attack, int defence, int speed, String job){
		name = nameput;
		hp = health;
		atk = attack;
		def = defence;
		spd = speed;
		job = job;
	}

	public String getName(){
		return name;
	}

	public String getJob(){
		return job;
	}

	public int getAttack(){
		return atk;
	}

	public int getHealth(){
		return hp;
	}

	public int getDefense(){
		return def;
	}

	public int getSpeed(){
		return spd;
	}

	public int attack(){
		System.out.println(name + " attacks the enemy!");
		return atk;
	}

	public int takeDamage(int attack){
		hp -= attack - def;
		int damage = attack - def;
		System.out.println(name + " took " + String.valueOf(damage) + " amount of damage. Current health: " + String.valueOf(hp));
		return attack - def;
	}

}
