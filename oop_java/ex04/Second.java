import java.util.Scanner;
class Second extends First{

	Second(String name, int number){
		super(name, number);
	}

	void number(){
	int number = (int) (Math.random()*6) + 1;
	return number;
	}
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();

	}
}