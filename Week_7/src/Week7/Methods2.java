package Week7;

import java.util.Scanner;

public class Methods2 {

	public static void main(String[] args) {
	     
		System.out.println(method1());
		String returnedValue = method1();
		System.out.println("The returnedValue is: " + returnedValue);
		
		
		System.out.println("--------------------------");
		
		System.out.println(method2());
		double returnedValue2 = method2();
		System.out.println("The returnedValue2 is: " + returnedValue2 );
		
		
		System.out.println("--------------------------");
		
		
		System.out.println(add(5 , 7));
		int returnedValue3 = add(10 , 14);
		System.out.println("The returnedValue3 is: " + returnedValue3);
		System.out.println("The add method value is: " + add(10 , 9));
		
		System.out.println("--------------------------");
		
		System.out.println(sum(5.5 , 17));
		System.out.println("The sum method value is: " + sum(10.3 , 9));
		
		double returnedValue4 = sum(3.1 , 25);
		System.out.println("The returnedValue4 is: " + returnedValue4);
		
		
		System.out.println("--------------------------");
		
		System.out.println("Welcome " + getUserName());
		
	    String userName = getUserName();
	    System.out.println("Welcome " + userName);
	    
	    

	}
	
	public static String getUserName() {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = input.next();
		return name;
	}
	
	public static double sum(double x, int y) {
		return x + y;
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static Double method2() {
		return 9.9;
	}
	
	public static String method1() {
		return "10";
	}
	
	

}
