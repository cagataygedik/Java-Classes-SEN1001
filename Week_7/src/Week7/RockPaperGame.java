package Week7;

import java.util.Scanner;

public class RockPaperGame {

	public static void main(String[] args) {
		String user = userMove();
		
		while(!user.equals("exit")) {
			String computer=computerMove();
			System.out.println("computer picks " + computer);
			//==
			//"a".equals("a") --> true
			//"a".equals("b") --> false

			if (user.equals(computer)) {
				System.out.println("TIE");
			}
			else if(user.equals("rock") && computer.equals("scissor")) {
				System.out.println("YOU WIN");
			}
			else if(user.equals("scissor") && computer.equals("paper")) {
				System.out.println("YOU WIN");
			}
			else if(user.equals("paper") && computer.equals("rock")) {
				System.out.println("YOU WIN");
			}
			else {
				System.out.println("COMPUTER WIN");
			}
			
			user = userMove();
		}
	    

	}
	
	public static String computerMove() {
		
		int number = RandomNumbers.generateInt(1, 4);
		
		switch(number) {
		case 1:
			return "rock";
		case 2:
			return "paper";
		default:
			return "scissor";
		}
	}
	
	public static String userMove() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your move or type exit");
		String move = input.next();
		return move;
	}

}
