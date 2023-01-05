package Week9;

import java.util.Arrays;

public class Arrays3 {

	public static void main(String[] args) {
		
		// This is not going to change because we are not passing the value.
		int a = 10;
		System.out.println("before: " + a);
		change(a);
		System.out.println("after: " + a);
		
		System.out.println("------------------");
		
		//This is going to change because we are passing the value.
		a = 10;
		System.out.println("before: " + a);
	    a = change2(a);
		System.out.println("after: " + a);
		
		System.out.println("------------------");
		
		int[] myArray = {0,0,0,0};
		System.out.println("before:" + Arrays.toString(myArray)); //before:[0, 0, 0, 0]
		change3(myArray);
		System.out.println("after:" + Arrays.toString(myArray)); //after:[-1, 0, 0, 0
		
	}
	
	public static void change(int a) {
		a = -1;
	}
	
	public static int change2(int a) {
		a = -1;
		return a;
	}
	
	public static void change3(int[] a) {
		a[0] = -1;
	}

}
