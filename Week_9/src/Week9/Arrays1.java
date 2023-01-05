package Week9;

public class Arrays1 {

	public static void main(String[] args) {
		
		//This is for creating an array.
		int []myArray;
		myArray = new int [4];
		int[] b = new int[10];
		
		//We are passing our values to the indexes.
		myArray[0] = 20;
		myArray[1] = 2;
		myArray[2] = 5;
		myArray[3] = -90;
		
		System.out.println(myArray[0]);
		System.out.println(myArray[1]);
		System.out.println(myArray[2]);
		System.out.println(myArray[3]);
		
		System.out.println("----------------------------");
		
		System.out.println("Length:" +myArray.length); //Length:4
		System.out.println(myArray[myArray.length-1]); //it will print-90
		
		System.out.println("----------------------------");		
		
		// With this commented line our array is terminated, so all of our values gone.
		//myArray = new int[5];
		
		
		printArray(myArray);
		//this for loop and printArray code is doing same work.
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]); //20,2,5,-90
		}
		
		System.out.println("----------------------------");
		
		String[] seasons = {"summer", "fall", "winter", "spring"};
		
		printArray(seasons);
		//this for loop and printArray code is doing same work.
		for (int i = 0; i < seasons.length; i++) {
			System.out.println(seasons[i]); //summer,fall,winter,spring
		}
		
	}
	
	//This method expects integer arrays.
	public static void printArray(int[] array1) {
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
	}
	
	//This method expects string arrays.
	public static void printArray(String[] array1) {
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
	}

}
