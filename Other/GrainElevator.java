import java.util.Scanner;
/*
*
*/
public class GrainElevator
{
    private int totalGrain = 0;
    GrainElevator(int initial)
    {
        totalGrain = initial;
    }
    public int getTotal() {
        return totalGrain;
    }
    public void deposit() {    
        System.out.println("How much is deposited?");
        Scanner in = new Scanner(System.in);
        int amount = 0;
        amount = in.nextInt();
        while (amount % 100 != 0)
        {
            System.out.println("Deposit not accepted: Must be in multiples of 100");
            System.out.println("How much is deposited?");
            amount = in.nextInt();
        }
        if (amount + totalGrain < 20000) {
            totalGrain += amount;
            System.out.println("Deposit accepted");
            System.out.println(totalGrain + " Tons of Grain");
        } else {
            System.out.println("Maximum capacity breached");
        }
    }
    public void shipment() {
        int amount = 0;
        System.out.println("How much would you like to Ship?");
        Scanner out = new Scanner(System.in);
        amount = out.nextInt();
        while (amount < 50)
        {
            System.out.println("Shipment Not Allowed: Must be at least 50 tons");
            System.out.println("How much would you like to Ship?");
            amount = out.nextInt();
        }
        if (totalGrain - amount >= 0) {
            totalGrain -= amount;
            System.out.println("Shipment Sent");
            System.out.println(totalGrain + " Tons of Grain");
        } else {
            System.out.println("Cannot ship grain you don't have");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Grain Elevator Recorder");    
        System.out.println("How many tons start in the elevator this morning?");
        Scanner scan = new Scanner(System.in);
        int initialGrain = scan.nextInt();
        System.out.println(initialGrain + " Tons of Grain");
        GrainElevator stock = new GrainElevator(initialGrain);
        while(stock.getTotal() > 0) {
            System.out.println("Deposit or Shipment (D/S)?");
            Scanner question = new Scanner(System.in);
            String DS = question.nextLine();
            if (DS.equals("D")) {
                stock.deposit();
            }
            if(DS.equals("S")) {
                stock.shipment();
            }
        }
    }
}
