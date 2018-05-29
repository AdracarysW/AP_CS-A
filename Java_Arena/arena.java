import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import Rogue;
import Marauder;
import BladeDancer;

public class Arena{

	Scanner scan = new Scanner(System.in);
	String name = scan.nextLine();

	public Arena()
	{
		ArrayList<Player> players = new ArrayList<Player>();

	}

	public void menu()
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
   		else if (phrase.equals("exit") || phrase.equals("quit"){
   			System.out.println("Exiting arena");
			//break;
		}
   		else{
   			menu();
		}
	}


	public void addPlayer(String input, String nameput)
	{
		if(input.equals("MARAUDER"))
		{
			Marauder player = new Marauder(nameput);
			System.out.println("CREATED MARAUDER PLAYER: " + nameput.toUpperCase());
		}
		else if(input.equals("ROGUE"))
		{
			Rogue player = new Rogue(nameput);
			System.out.println("CREATED ROGUE PLAYER: " + nameput.toUpperCase());
		}
		else if(input.equals("BLADEDANCER"))
		{
			BladeDancer player = new BladeDancer(nameput);
			System.out.println("CREATED BLADEDANCER PLAYER: " + nameput.toUpperCase());
		}
		this.players.add(player);
	}

}
