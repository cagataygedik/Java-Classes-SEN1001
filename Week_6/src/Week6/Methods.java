package Week6;

import java.util.Scanner;

public class Methods {
	
	//public static return_type method_name(parameter) {   }.

	public static void main(String[] args) {
		
		printStars();
		
		printHashtag(10);
		
		blabla(12, "+");
		
		// This part take the input of number(n1).
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int n1 = input.nextInt();
		
		// This part take the input of symbol(symbol)
		String symbol = input.next();
		System.out.println("Enter the symbol");
		blabla(n1, symbol);
	}
	
	// This method prints as many symbols as entered number.
	public static void blabla(int number, String symbol) {
		for (int i = 0; i < number; i++) {
			System.out.println(symbol);
		}
		System.out.println();
	}
	
	// This method prints as many hashtags as entered number.
	public static void printHashtag(int number) {
		for (int i = 0; i < number; i++) {
			System.out.print("#");
		}
		System.out.println("");
	}
	
	// This method prints 20 stars.
	public static void printStars() {
		for (int i = 0; i < 20; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
