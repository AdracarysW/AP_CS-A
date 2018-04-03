import java.util.Scanner;
public class FirstClass {

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        SecondClass second = new SecondClass(name);
    }

}
