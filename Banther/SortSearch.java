import java.util.Random;
import java.util.Arrays;
public class SortSearch{
    public static void main(String [] args){
        Random r = new Random();  
        int[] ary = new int[10000000];
         for(int i = 0; i < ary.length; i++)
        {
             int rand = r.nextInt(2000);
             ary[i] = rand;
        }
        for(int x = 50; x < 100; x++){
             System.out.println(ary[x]);
        }    
        System.out.print(ary[0]);
    }
}
