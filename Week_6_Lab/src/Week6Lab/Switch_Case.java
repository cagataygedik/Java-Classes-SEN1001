package Week6Lab;

import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Give me number between 1-12");
		int month = input.nextInt();
		
		switch(month) {
		case 1:
			System.out.println("Tiger month");
			break;
		case 2:
			System.out.println("Rabit month");
			break;
		case 3:
			System.out.println("Dragon month");
			break;
		case 4:
			System.out.println("Snake month");
			break;
		case 5:
			System.out.println("Horse month");
			break;
		case 6:
			System.out.println("Goat month");
			break;
		case 7:
			System.out.println("Monkey month");
			break;
		case 8:
			System.out.println("Rooster month");
			break;
		case 9:
			System.out.println("Dog month");
			break;
		case 10:
			System.out.println("Pig month");
			break;
		case 11:
			System.out.println("Rat month");
			break;
		case 12:
			System.out.println("Ox month");
			break;
		default:
			System.out.println("you should write between 1-12");
		}

	}

}
