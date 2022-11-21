package Week7;

public class Methods {

	public static void main(String[] args) {
		
		//first method
		countToN(8);
		
		System.out.println("---------------------");
		
		//second method
		countToX(5, "-");
		
		System.out.println("---------------------");
		
		for (int i = 1; i <= 5; i++) {
			//1 
			//1 2 
			//1 2 3 
			//1 2 3 4 
			//1 2 3 4 5 
			countToN(i);
		}		
		
	}
	
	//create a method that will count to a given n number
    // first method
	public static void countToN(int n) {
		
		for(int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	//create a method that will count to a given x number, and separate number with given separator
	// second method
	public static void countToX(int x, String seperator) {
		for(int i = 1; i <= x; i++) {
			System.out.print(i + seperator);
		}
		System.out.println();
	}

}
