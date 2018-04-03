import java.util.Scanner;

public class CombinationLock
{
    private String inputCombo = "";
    private String Combo = "";
    
   CombinationLock(String secret) {
        Combo = secret;
    }
    
   public void turnDial(char input)
    {
        inputCombo += input;
    }

   public void checkOpen()
    {
        String triLast;
        if (inputCombo.length() > 2)
        {
            triLast = inputCombo.substring(inputCombo.length() - 3);
        }else{
            triLast = inputCombo;
        }
        System.out.println("Trying door...");
        if (Combo.equals(triLast))
        {
            System.out.println("Access Granted");
        }else{
            System.out.println("Access Denied");
        }
    }

   public void close()
    {
        inputCombo = "";  
    }
   
   public static void main(String []args)
   {       
       CombinationLock lock = new CombinationLock("ABC");
       lock.turnDial();
       lock.
   }
}