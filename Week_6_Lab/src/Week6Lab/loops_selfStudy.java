package Week6Lab;

import java.util.Scanner;

public class loops_selfStudy {
	//a

	public static void main(String[] args) {
		
		// 6 ^ 7 = 279936
		//System.out.println(Math.pow(6, 7));
		
		//int i = 0;
		//int result = 1;
		
		//while( i < 7) {
		//	result *= 6;
		//	i++;
		//}
		//System.out.println("6 ^ 7 = " + result);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Give me the base:");
		int base = input.nextInt();
		
		System.out.println("Give me the power: ");
		int power = input.nextInt();
		
		int i = 0;
		int result = 1;
		
		while(i < power) {
			
			result *= base;
			i++;
			
		}
		System.out.println(base + " ^ " + power + " = " + result);
		

	}

}
