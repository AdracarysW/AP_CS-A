public class arrayPrince{

	public static void main(String[] args){

		int[][] arr;
		arr = new int[11][1];
		for (int a = 0; a < arr.length; a++)
			for (int b = 0; b < arr[a].length; b++)
				arr[a][b] =  a * 5;
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++)
				System.out.println(arr[i][j]);
			
	}
}