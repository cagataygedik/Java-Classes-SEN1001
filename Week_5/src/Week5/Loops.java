package Week5;

public class Loops {

	public static void main(String[] args) {
		
		// It will print 5 stars.
		int counter = 10;
		while(counter > 5) {
			
			// Iterates
			System.out.println("*");
			counter = counter - 1;
		}
		
		// It will print 5 ?
		System.out.println("----");
		counter = 5;
		while(counter < 10) {
			System.out.println("?");
			counter = counter + 1;
		}
		
		// It will print even numbers between 50-100
		System.out.println("----");
		int n = 100;
		while (n >= 50) {
			System.out.println(n);
			n -= 2;
		}
		
		// It will print numbers with saying that they're even or odd.
		n = 50;
		while(n <= 100) {
		if(n % 2 == 0) {
			System.out.println(n + " is even number");
		}
		else {
			System.out.println(n + " is odd number");
		}
		n = n + 1;
		
		
	}
	}
}
