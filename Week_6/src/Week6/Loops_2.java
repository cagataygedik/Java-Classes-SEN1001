package Week6;

public class Loops_2 {

	public static void main(String[] args) {
		//print number between 1000-800 that divisible by 3
		int number=1000;
		
		while(number>=800) {
			if(number%3==0) {
				System.out.println(number + " is divisible by 3");
			}
			else {
				System.out.println(number + " is not divisible by 3");
			}
			number--;
		}
		
		System.out.println("----------");
		
		// It will print 5 stars
		int m = 10;
		while(m < 15) { //10, 11, 12, 13, 14,
			System.out.println("*");
			m++;
		}
		
		System.out.println("----------");
		
		//do - while
		// If condition isn't true in do-while statements it's going to be always print for only once.
		m = 10;
		do {
			System.out.println("*");
			m++;
		}while(m>15);
		
		System.out.println("----------");
		
		//for
		int a;
		for(a = 0; a < 5; a++) { //0, 1, 2, 3, 4
			System.out.println(a);
		}
		
		
		for(int b = 100; b > 10; b -= 5) {
			System.out.println(b);
		}
		

	}

}








