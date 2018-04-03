import java.util.Scanner;
public class second extends first{

	static Scanner scan = new Scanner(System.in);
	static String name = scan.nextLine();


    second(String name){
        super(name);

    }
    public static void main(String[] args)
    {
        second sec = new second(name);
    }
}
