import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;
// import Rogue;
// import Marauder;
// import BladeDancer;

public class Arena{

	Scanner scan = new Scanner(System.in);
	String name = scan.nextLine();
	Random rand = new Random();
	ArrayList<Player> players = new ArrayList<Player>();

	private void menu()
	{
		int input = scan.nextInt();
		String phrase = scan.nextLine();
		System.out.println("Menu (Please enter the numeric value to access)\n" +
						   "1. Player Types\n" +
						   "2. Add Players\n" +
						   "3. Play Arena\n" +
						   "4. View Players\n" +
						   "?> ");
	    if (input == 1){
   			jobDetail();
		}
   		else if (input == 2){
   			createPlayer();
		}
   		else if (input == 3){
   			playArena();
		}
   		else if (input == 4){
   			viewPlayer();
		}
   		else if (phrase.equals("exit") || phrase.equals("quit")){
   			System.out.println("Exiting arena");
			//break;
		}
   		else{
   			menu();
		}
	}

	private void playArena(){
		if (players.size() <= 1){
			System.out.println("You must have at least two players to begin fighting");
		}
		else {
			int input = scan.nextInt();
			int i = 0;
			System.out.println("Please type the number for the player you want to use for player one");
			do {
				System.out.println("Player " + String.valueOf(i) + ": " + players.get(i).getName() + " (" + players.get(i).getJob() + ")");
				i += 1;
			} while (i < players.size());
			System.out.println("> ");
			if (input >= players.size())
				System.out.println("Please enter a valid player number (just the number)");
			else {
				int input2 = scan.nextInt();
				System.out.println("Please type the number for the player you want to use for player two");
				System.out.println("> ");
				if (input2 >= players.size()){
					System.out.println("Please enter a valid player number (just the number)");
				}
				else if (input2 == input){
					System.out.println("You cannot repeat the same player number");
				}
				else{
					fight(input, input2);
				}
			}
		}
		menu();
	}

	private void jobDetail(){
		System.out.println("There are three jobs that players can be");
		System.out.println("");
		System.out.println("Murmillo: Aggresive melee fighter who specialize in defense and survivability");
		System.out.println(" Skill 1: Recovers half of their missing health");
		System.out.println(" Skill 2: Strikes twice and heals self for the damage dealt");
		System.out.println("");
		System.out.println("Swordsinger: Close combat spell caster that mix melee and magic");
		System.out.println(" Skill 1: Raises own defense while dealing damage");
		System.out.println(" Skill 2: Raises own attack while dealing damage");
		System.out.println("");
		System.out.println("Mergen: Swift ranged users who specialize in multiple hits");
		System.out.println(" Skill 1: Strikes enemy three times with reduce damage");
		System.out.println(" .get(y)Skill 2: Hits enemy a random amount of time with no damage penalty");
		menu();
	}

	private void viewPlayer(){
		int i = 0;
		if (players.size() == 0){
			System.out.println("No players has been added yet");
		}
		else {
			do{
				if (i != 0){
					System.out.println("");
				}
				System.out.println("Player Name: " + players.get(i).getName());
				System.out.println("Player Job: " + players.get(i).getJob());
				System.out.println("Health: " + players.get(i).String.valueOf(getHealth()));
				System.out.println("Attack: " + players.get(i).String.valueOf(getAttack()));
				System.out.println("Defense: " + players.get(i).String.valueOf(getDefense()));
				System.out.println("Speed: " + players.get(i).String.valueOf(getSpeed()));
				i += 1;
			} while (i < players.size());
		}
		menu();
	}

	private void createPlayer(){
		String input = scan.nextLine();
		System.out.println("Please provide what job you want the player to be:");
		System.out.println("> ");
		if (input.equals("MURMILLO") || input.equals("SWORDSINGER")|| input.equals("MERGEN"))
		{
			System.out.println("Please proivde a name for the player:");
			System.out.println("> ");
			String nameput = scan.nextLine();
			addPlayer(input, nameput);
		}
		else{
			System.out.println("Invalid job, please enter a valid player type");
		}
		menu();
	}

	private void addPlayer(String input, String nameput)
	{
		if(input.equals("MARAUDER"))
		{
			Marauder playa = new Marauder(nameput);
			System.out.println("CREATED MARAUDER PLAYER: " + nameput.toUpperCase());
		}
		else if(input.equals("ROGUE"))
		{
			Rogue playa = new Rogue(nameput);
			System.out.println("CREATED ROGUE PLAYER: " + nameput.toUpperCase());
		}
		else if(input.equals("BLADEDANCER"))
		{
			BladeDancer playa = new BladeDancer(nameput);
			System.out.println("CREATED BLADEDANCER PLAYER: " + nameput.toUpperCase());
		}
		players.add(playa);
	}

	private void fight(int x, int y)
	{
		int n = 3;
		System.out.println( "BATTLE WILL COMMENCE BETWEEN " + players.get(x).getName().toUpperCase() + " AND " + players.get(y).getName().toUpperCase());
		do{
			System.out.println(String.valueOf(n) + "...");
			TimeUnit.SECONDS.sleep(1);
			n -= 1;
		} while (n >= 0);

		while (players.get(x).getHealth() > 0 && players.get(y).getHealth() > 0)
		{
			int i = rand.nextInt(6) + 1;
			if (players.get(x).getSpeed() > players.get(y).getSpeed())
			{
				if (i <= 3)
				{
					players.get(y).takeDamage(players.get(x).attack());
					}
				else if (i == 6)
				{
					players.get(y).takeDamage(players.get(x).skillTwo());
					}
				else
				{
					players.get(y).takeDamage(players.get(x).skillOne());
				}
				if (players.get(y).getHealth() <= 0)
				{
					System.out.println( players.get(x).getName() + " won the fight!");
					menu();
				}
				i = rand.nextInt(6) + 1;
				if (i <= 3)
				{
					players.get(x).takeDamage(players.get(y).attack());
				}
				else if (i == 6)
				{
					players.get(x).takeDamage(players.get(y).skillTwo());
				}
				else
				{
					players.get(x).takeDamage(players.get(y).skillOne());
				}
				if (players.get(x).getHealth() <= 0)
				{
					System.out.println(players.get(y).getName() + " won the fight!");
					menu();
				}
				System.out.println("");
				TimeUnit.SECONDS.sleep(1);
			}
			else{
				i = rand.nextInt(6) + 1;
				if (i <= 3)
				{
					players.get(x).takeDamage(players.get(y).attack());
				}
				else if (i == 6)
				{
					players.get(x).takeDamage(players.get(y).skillTwo());
				}
				else
				{
					players.get(x).takeDamage(players.get(y).skillOne());
				}
				if (players.get(x).getHealth() <= 0)
				{
					System.out.println(players.get(y).getName() + " won the fight!");
					menu();
				}
				i = rand.nextInt(6) + 1;
				if (i <= 3)
				{
					players.get(y).takeDamage(players.get(x).attack());
				}
				else if (i == 6)
				{
					players.get(y).takeDamage(players.get(x).skillTwo());
				}
				else
				{
					players.get(y).takeDamage(players.get(x).skillOne());
				}
				if (players.get(y).getHealth() <= 0)
				{
					System.out.println(players.get(x).getName() + " won the fight!");
					menu();
				}
			}
			System.out.println("");
			TimeUnit.SECONDS.sleep(2);
		}
	}

	private static void main(String [] args){

		System.out.println("Welcome to the arena. This is where you can have multiple people fight");
		Arena game = new Arena();
		game.menu();
	}

}
