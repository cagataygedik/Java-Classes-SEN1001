package Week10;

import java.util.Random;

public class MultidimensionalArray {

	public static void main(String[] args) {
		
		//every data type can have an array.
		//datatype[] name = new datatype[size];
		
		//every array becomes a data type.
		int[] a = new int[3];
		
		
		int[][] b = new int[3][];
		b[0] = new int[4];
		b[1] = new int[2];
		b[2] = a;
		/* array of b is going to look like this.
		 * ----
		 * --
		 * ---
		 */
		
		fill2DArray(b);
		print2DArray(b);

	}
	
	public static void fill2DArray(int[][] myArray) {
		Random r = new Random();
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray[i].length; j++) {
				myArray[i][j] = r.nextInt(100); //0-99
			}
		}
	}
	
	public static void print2DArray(int[][] myArray) {
		for (int i = 0; i < myArray.length; i++) {
			for(int j = 0; j < myArray[i].length; j++) {
				System.out.print(myArray[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}
