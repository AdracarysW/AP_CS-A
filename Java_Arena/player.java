
public class Player{

	public Player(String nameput, int health, int attack, int defense, int speed, String job){
		this.name = nameput;
		this.hp = health;
		this.atk = attack;
		this.def = defence;
		this.spd = speed;
		this.job = job;
	}

	public String getName(){
		return this.name;
	}

	public String getJob(){
		return this.job;
	}

	public int getAttack(){
		return this.atk;
	}

	public int getHealth(){
		return this.hp;
	}


	public int getDefense(){
		return this.def;
	}

	public int getSpeed(){
		return this.spd;
	}

	public int attack(){
		System.out.println(this.name + " attacks the enemy!");
		return this.atk;
	}

	public int takeDamage(int attack){
		this.hp -= attack - this.def;
		int damage = attack - this.def;
		System.out.println(this.name + " took " + String.valueOf(damage) + " amount of damage. Current health: " + String.valueOf(this.hp));
		return attack - this.def;
	}

}
