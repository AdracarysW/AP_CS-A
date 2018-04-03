/*
* This is a simple two dimensional array program
*/

public class TwoDimensionalArray
{
    public static void main(String[] args)
    {
        String[][] sound = {{"one", "two", "three"},{"four", "five", "six"}};
        System.out.println(sound[0][1]);
        String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        };
        // Mr. Smith
        System.out.println(names[0][0] + names[1][0]);
        // Ms. Jones
        System.out.println(names[0][2] + names[1][1]);
        // Mrs. Smith
        System.out.println(names[0][1] + names[1][0]);
        // Mr. Jones
        System.out.println(names[0][0] + names[1][1]);
    }
} 