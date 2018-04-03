import java.util.Random;
import java.util.Scanner;
/**
 * Create a dice class and use it to roll 2 dice 10000 times and calculate the frequency of each roll (2, 3, 4, etc).
 * Create a horizontal graph of the results.
 */

public class DiceArray
{
    
    private static int DICE_SIDES = 6;
    private int numDice;

    public DiceArray(int numberOfdice){
        numDice = numberOfdice; 
    }
    public void rolldice() {
        Random gen = new Random();
        char star = '*';
        int[] dice = new int[numDice];
        int maxValue =  numDice * DICE_SIDES;
        int total[] = new int[1 + maxValue];
        
        for (int index = 0; index < total.length; index++ )
            total[ index ] = 0;
        
        for (int roll = 1; roll <= 10000; roll++ )
        {
            int diceSum = 0;
            for(int t = 0; t < numDice; t++){
                dice[t] = 1 + gen.nextInt(DICE_SIDES);
                diceSum += dice[t];
            }
            total[ diceSum ]++;
        }
        for (int r = 2; r <= maxValue; r++)
        {
            System.out.println(total[r]);
        }
        for(int l = 2; l <= maxValue; l++)
        {
            for (int i = 1; i <= total[l]; i += 10)
            {
                System.out.print(star);

            }
            System.out.print("\n");
        }
    }
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many dice would you like to roll? ");
        int numDice = scan.nextInt();
        DiceArray play = new DiceArray(numDice);
        play.rolldice();    
    }
}

