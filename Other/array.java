/*
* This is a simple one dimensional array program 
*/
class array {

    private static int SIZE = 10;

    public static void main(String[] args) {
        
        String[] anArray;
        
        anArray = new String[SIZE]; 
           

        for (int i = 0; i < SIZE; i++)
        {
            anArray[i] = "HelloPython";
            System.out.println("Element at index" + i +": " + anArray[i]);
        }
    }
} 