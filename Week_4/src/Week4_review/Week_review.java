package Week4_review;

import java.util.Scanner;

public class Week_review {

	public static void main(String[] args) {
		
		//Boolean
		boolean isOn = true;
		isOn = false;
		
		String userName = "Çağatay";
		int n1;
		n1 = -10;
		
		System.out.println(userName);
		
		//getting input - Scanner
		Scanner cagatay = new Scanner(System.in);
		System.out.println("enter an integer");
		int n2 = cagatay.nextInt();
		
		System.out.println("enter an double");
		double n3 = cagatay.nextDouble();
		System.out.println("n2 * n3 = " + n2*n3); //result is n2 * n3 = 24.0
		
		int b=3;
		double a=10;
		System.out.println(a/b); //result is 3.333333

	}

}
