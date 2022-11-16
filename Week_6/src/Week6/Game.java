package Week6;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// let the user guess a number in 3 trials
		int number = 30;
		int trials = 3;
		
		Scanner input = new Scanner(System.in);
		
		while(trials > 0 ) {
			System.out.println("Enter the number");
			int guess = input.nextInt();
			
			if (guess == number) {
				System.out.println("You win");
				System.out.println("Game over");
				break;
			} else {
				System.out.println(trials == 1 ? "you lost game over" : "try again");
			}
			
			trials --;
			
		}

	}

}
