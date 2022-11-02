package Week4_review;

import java.util.Scanner;

public class Week4_CalculateArea {

	public static void main(String[] args) {
		
		Scanner Calculator = new Scanner(System.in);
		System.out.println("Give me the radius");
		double r = Calculator.nextDouble();
		//pi*r*r
		System.out.println("The area is " + Math.PI*r*r);
	}

}
