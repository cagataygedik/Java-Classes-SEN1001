package Midterm;

public class Methods {
	
	public static void main(String[] args) {
		
		//no parameter, with return
		System.out.println(name());
		
		//with parameter and return
		System.out.println(add(5, 7));
		
		//with parameter, no return
		printStars(4);
		
		//no parameter, no return
		printPlus();
	}
	
	//no parameter, with return
	public static String name() {
		return "çağatay";
	}
	
	//with parameter and return
	public static int add(int a, int b) {
		return a+b;
	}
	
	
	//with parameter, no return
	public static void printStars(int stars) {
		for(int x = 0; x <= stars ; x++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	//no parameter, no return
	public static void printPlus() {
		for(int i = 0; i <= 5; i++) {
			System.out.print("+");
		}
		System.out.println();
	}

}
