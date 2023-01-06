package Week9;

import java.util.Random;

import Week9.Arrays1;

public class Arrays4 {

	public static void main(String[] args) {
		
		int[] a = new int[5]; //0|0|0|0|0
		
		fillArray(a);
		
		Arrays1.printArray(a);
	}
	
	public static void fillArray(int[] myArray) {
		Random rnd = new Random();
		
		for(int i = 0; i < myArray.length; i++) {
			myArray[i] = rnd.nextInt(20); //0-19
		}
	}

}
